package smiley;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        BorderPane root = new BorderPane();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.setCenter(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(60, 60, 20, 20);
        gc.fillRect(120, 60, 20, 20);
        gc.fillRect(135, 110, 20, 20);
        gc.fillRect(45, 110, 20, 20);
        gc.fillRect(65, 130, 20, 20);
        gc.fillRect(85, 130, 20, 20);
        gc.fillRect(105, 130, 20, 20);
        gc.fillRect(115, 130, 20, 20);
        
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
}