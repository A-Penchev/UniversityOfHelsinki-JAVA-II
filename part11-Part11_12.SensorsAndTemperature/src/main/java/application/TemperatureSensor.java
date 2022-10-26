
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TemperatureSensor implements Sensor {
    private int sensorStatus=0;

    @Override
    public boolean isOn() {
        if(sensorStatus==1){
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        this.sensorStatus=1;
    }

    @Override
    public void setOff() {
        this.sensorStatus=0;
    }

    @Override
    public int read() {
        int readNum=0;
        if(this.sensorStatus==1){
                readNum=new Random().nextInt(61)-30;
            return readNum;
        }
        throw new IllegalStateException("error");
    } 
}
