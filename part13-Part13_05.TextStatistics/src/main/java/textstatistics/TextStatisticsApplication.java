package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

public class TextStatisticsApplication extends Application {


    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        HBox components=new HBox();
 
        layout.setCenter(new TextArea(""));
        
        components.getChildren().add(new Label("Letters: 0"));
        components.getChildren().add(new Label("Words: 0"));
        components.getChildren().add(new Label("The longest word is:"));
        
        layout.setBottom(components);
        
        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}
