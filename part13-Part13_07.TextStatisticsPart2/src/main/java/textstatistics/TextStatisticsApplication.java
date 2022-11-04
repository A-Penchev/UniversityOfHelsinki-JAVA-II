package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
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
        Label letters=new Label();
        Label words=new Label();
        Label longest=new Label();
        
        TextArea text=new TextArea();

        layout.setCenter(text);
        
        text.textProperty().addListener((change, oldValue, newValue) -> {
        int characters = newValue.length();
        String[] parts = newValue.split(" ");
        int word = parts.length;
        String longestest = Arrays.stream(parts)
        .sorted((s1, s2) -> s2.length() - s1.length())
        .findFirst()
        .get();
        
        
        letters.setText("Letters: "+Integer.toString(characters));
        words.setText("Words: "+Integer.toString(word));
        longest.setText("The longest word is: "+longestest);
        });
        
        
        
        components.getChildren().addAll(letters,words,longest);
        
        layout.setBottom(components);
        
        
        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}
