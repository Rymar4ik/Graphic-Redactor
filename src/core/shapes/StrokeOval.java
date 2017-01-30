package core.shapes;

import javafx.scene.canvas.GraphicsContext;

public class StrokeOval extends Oval {

    public StrokeOval(Point center, double radius) {
        super(center, radius);
    }

    public StrokeOval(Point center, double width, double height) {
        super(center, width, height);
    }

    @Override
    public void draw(GraphicsContext gc) {
        super.draw(gc);
        gc.strokeOval(p.getX(), p.getY(), width, height);
    }
}
