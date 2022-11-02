package notifier;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {


    @Override
    public void start(Stage stage) {
        
        VBox components=new VBox();
        TextField top = new TextField();
        Button middle = new Button("Update");
        Label bottom=new Label("");
        
        middle.setOnAction((event) -> {
        bottom.setText(top.getText());});
        
        components.getChildren().addAll(top,middle,bottom);
  
        Scene scene = new Scene(components);

        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
}
