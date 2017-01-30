package core.shapes;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by StaslaMasla on 30.01.2017.
 */
public class FillOval extends Oval {

    public FillOval(Point center, double radius) {
        super(center, radius);
    }

    public FillOval(Point center, double width, double height) {
        super(center, width, height);
    }

    @Override
    public void draw(GraphicsContext gc) {
        super.draw(gc);
        gc.fillOval(p.getX(), p.getY(), width, height);
    }
}
