package sample.shapes;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by StaslaMasla on 30.01.2017.
 */
public class Rectangle extends Shape {

    private Point p;
    private double width;
    private double height;

    public Rectangle(Point p, double width, double height) {
        this.p = p;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(GraphicsContext gc) {
        super.draw(gc);
        gc.fillRect(p.getX(), p.getY(), width, height);
    }
}
