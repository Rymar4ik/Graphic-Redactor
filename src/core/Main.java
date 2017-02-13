package core;

import core.engines.CanvasEngine;
import core.shapes.Oval;
import core.shapes.Point;
import core.shapes.Rectangle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage stage;
    private Group group;
    private Scene scene;

    private Canvas canvas;
    private GraphicsContext gc;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        this.stage = primaryStage;
        group = new Group();
        scene = new Scene(group, 1024, 768);

        scene.setOnMousePressed(e ->{
            gc.lineTo(e.getSceneX(), e.getSceneY());
            gc.stroke();
        });

        scene.setOnMouseDragged(e -> {
            gc.lineTo(e.getSceneX(), e.getSceneY());
            gc.stroke();
        });

        canvas = new Canvas(scene.getWidth(), scene.getHeight());
        gc = canvas.getGraphicsContext2D();

        drawShapes(gc);
        group.getChildren().add(canvas);

        stage.setScene(scene);
        stage.show();
    }

    private void drawShapes(GraphicsContext gc) {

        CanvasEngine ce = new CanvasEngine();
        ce.setGraphicContext(gc);

        Rectangle line = new Rectangle(new Point(100, 100), 100, false);
        line.show(ce);



        Oval oval1 = new Oval(new Point(200, 100), 50, false);
        Oval oval2 = new Oval(new Point(200, 200), 30, 50, true);
        oval1.show(ce);
        oval2.show(ce);
    }
}
