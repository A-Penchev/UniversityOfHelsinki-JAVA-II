package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        VBox firstView=new VBox();
        
        Label welcome=new Label("Enter your name and start.");
        TextField textField=new TextField();
        Button startButton=new Button("Start");
        
        firstView.getChildren().addAll(welcome,textField,startButton);
        //first scene
        
        BorderPane secondView=new BorderPane();
        Label name=new Label();
        
        secondView.setCenter(name);
        //second scene
        
        Scene first = new Scene(firstView);
        Scene second = new Scene(secondView);
        
        startButton.setOnAction((event) -> {
          name.setText("Welcome "+textField.getText()+"!");
          window.setScene(second);
        });
        
        window.setScene(first);
        window.show();
    }
}
