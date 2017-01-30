package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sample.shapes.Line;
import sample.shapes.Point;
import sample.shapes.Rectangle;

public class Main extends Application {

    private Stage stage;
    private Group group;
    private Scene scene;

    private Canvas canvas;
    private GraphicsContext gc;

    @Override
    public void start(Stage primaryStage) throws Exception {

        this.stage = primaryStage;
        group = new Group();
        scene = new Scene(group, 1024, 768);

        canvas = new Canvas(scene.getWidth(), scene.getHeight());
        gc = canvas.getGraphicsContext2D();

        drawShapes(gc);
        group.getChildren().add(canvas);

        stage.setScene(scene);
        stage.show();
    }

    private void drawShapes(GraphicsContext gc){

        Line line = new Line(new Point(0, 0), new Point(200,200));
        line.setLineColor(Color.GREEN);
        line.draw(gc);

        Rectangle rectangle = new Rectangle(new Point(100, 100), 30, 30);
        rectangle.draw(gc);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
