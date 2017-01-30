package sample.shapes;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by StaslaMasla on 30.01.2017.
 */
public class Line extends Shape {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void draw(GraphicsContext gc) {
        super.draw(gc);
        gc.strokeLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
