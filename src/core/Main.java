package core;

import core.shapes.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

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

        Oval oval1 = new StrokeOval(new Point(10, 10), 30, 60);
        Oval center = new FillOval(new Point(10,10), 5 );
        center.setFillColor(Color.RED);
        Oval oval2 = new StrokeOval(new Point(50, 10), 30);
        Oval oval3 = new FillOval(new Point(90, 10), 30, 60);
        Oval oval4 = new FillOval(new Point(130, 10), 30);
        oval1.draw(gc);
        oval2.draw(gc);
        oval3.draw(gc);
        oval4.draw(gc);
        center.draw(gc);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
