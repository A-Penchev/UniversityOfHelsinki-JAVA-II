package buttonandtextfield;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;

public class ButtonAndTextFieldApplication extends Application{

    @Override
    public void start(Stage stage) {
        TextField text = new TextField();
        Button button = new Button("Update");

        VBox components = new VBox();
        components.getChildren().addAll(text, button);

        Scene scene = new Scene(components,200,100);

        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }
}

