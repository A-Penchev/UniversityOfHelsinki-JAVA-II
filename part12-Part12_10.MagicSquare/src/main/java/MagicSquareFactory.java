
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square=new MagicSquare(size);
        int startNum=1;
        int row=0;
        int column=midPoint(size);
        square.placeValue(column,row, startNum);
        
        while(totalNum(size)>startNum){
            row--;
            column++;
            if(square.readValue(column, row)>0){
                row++;
                row++;
                column--;
                startNum++;
                square.placeValue(column,row, startNum);
            }
            if(square.readValue(column,row)==0){
                startNum++;
                square.placeValue(column, row, startNum);
            }       
            if(row<0){
                startNum++;
                row=size-1;
                if(column>=size){
                    column--;
                    row=1;
                }
                square.placeValue(column,row, startNum);
            }
            if(column==size){
                startNum++;
                column=0;
                square.placeValue(column,row, startNum);
            } 
        }
        /***while (number <= numbers) {
            square.placeValue(x, y, number);
 
            // is the position to the top right free
            // get the position
            int candidateY = y - 1;
            int candidateX = x + 1;
 
            if (candidateY < 0) {
                candidateY += size;
            }
 
            if (candidateX >= size) {
                candidateX %= size;
            }
 
            // if the position is free, we'll place the number there
            if (square.readValue(candidateX, candidateY) == 0) {
                x = candidateX;
                y = candidateY;
            } else {
                // the position is not free, so we move "down"
                y++;
                if (y >= size) {
                    y = 0;
                }
            }
 
            number++;
 
        }***/
        return square;
    }
    public int midPoint(int size){
        return size/2;
    }
    public int totalNum(int size){
        return size*size;
    }

}
