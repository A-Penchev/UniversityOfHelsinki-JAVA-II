
package mooc.logic;
import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface textLogic;
    
    public ApplicationLogic(UserInterface textLogic){
        this.textLogic=textLogic;
    }
    public void execute(int times){
        for(int i=0;i<times;i++){
            System.out.println("Application logic is working");
            textLogic.update();
        }
    }
    
}
