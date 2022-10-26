
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor{
    private List<Sensor> sensorList=new ArrayList<>();
    private List<Integer> readNums=new ArrayList<>();
    
    public void addSensor(Sensor toAdd){
        sensorList.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for(Sensor cycle: sensorList){
            if(cycle.isOn()==false){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        sensorList.stream()
                .forEach(sensor->sensor.setOn());
    }

    @Override
    public void setOff() {
        sensorList.stream()
                .forEach(sensor->sensor.setOff());
    }

    @Override
    public int read() {
        if(sensorList.isEmpty()){
            throw new IllegalStateException("error lol");
        }
        int readNum=0;
        int sum=0;
        int count=0;
        for(Sensor cycle:sensorList){
            readNum=cycle.read();   
            sum+=readNum;
            count++;
        }
        readNums.add(sum/count);
        return sum/count;
    }
    public List<Integer> readings(){
        return readNums;
    }
    
}
