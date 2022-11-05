package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class MultipleViews extends Application {

    public static void main(String[] args) {
       launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window){
        BorderPane firstView=new BorderPane();
        firstView.setTop(new Label("First view!"));
        Button secondViewButton=new Button("To the second view!");
        firstView.setCenter(secondViewButton);
        
        VBox secondView=new VBox();
        Button toThirdButton=new Button();
        Label secondViewLabel=new Label("Second view!");
        secondView.getChildren().addAll(toThirdButton,secondViewLabel);
        
        GridPane thirdView=new GridPane();
        Label thirdViewLabel=new Label("Third view!");
        Button firstViewButton=new Button("To the first view!");
        GridPane.setConstraints(thirdViewLabel, 0, 0);
        GridPane.setConstraints(firstViewButton, 1, 1);
        thirdView.getChildren().addAll(thirdViewLabel, firstViewButton);
        
        
        /***     GridPane gridpane = new GridPane();
     gridpane.add(new Button(), 1, 0); // column=1 row=0
     gridpane.add(new Label(), 2, 0);  // column=2 row=0
     ***/
        
        Scene first = new Scene(firstView);
        Scene second = new Scene(secondView);
        Scene third=new Scene(thirdView);
        
        firstViewButton.setOnAction((event) -> {
          window.setScene(first);
        });
        secondViewButton.setOnAction((event) -> {
          window.setScene(second);
        });
        toThirdButton.setOnAction((event) -> {
          window.setScene(third);
        });
  
        window.setScene(first);
        window.show();
    }
    
    

}
