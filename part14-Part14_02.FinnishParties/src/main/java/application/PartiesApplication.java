package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        
    }

    @Override
    public void start(Stage stage){
        NumberAxis xAxis= new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("");
        yAxis.setLabel("");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        
        try(Scanner fileScan=new Scanner(Paths.get("partiesdata.tsv"))){
            fileScan.nextLine();
            while(fileScan.hasNextLine()){
                String[] pieces = fileScan.nextLine().split("\t");
                XYChart.Series rkpData = new XYChart.Series();
                rkpData.setName(pieces[0]);
                for(int i=1;i<=11;i++){
                if(!pieces[i].equals("-")){
                    int year=1964+i*4;
                    rkpData.getData().add(new XYChart.Data(year, Double.valueOf(pieces[i])));
                    }
                }
                lineChart.getData().add(rkpData);
            }
         }   catch (IOException ex) {
            Logger.getLogger(PartiesApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    
    }
}

