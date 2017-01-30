package core.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Created by StaslaMasla on 30.01.2017.
 */
public abstract class Shape implements Drawable {

    private Color line = Color.RED;
    private Color fill = Color.GREEN;
    private int lineWidth = 1;

    @Override
    public void setLineColor(Color line) { this.line = line;}

    @Override
    public void setFillColor(Color fill) { this.fill = fill;}

    @Override
    public void setLineWidth(int lineWidth) { this.lineWidth = lineWidth;}

    //TODO: Стоит ли этот метод выносить в интерфейс? Не нарушает пристутствие такого метода cаму задумку интерфейса?
    private void applyDrawSettings(GraphicsContext gc) {
            gc.setFill(fill);
            gc.setStroke(line);
            gc.setLineWidth(lineWidth);
    }

    @Override
    public void draw(GraphicsContext gc) {
        applyDrawSettings(gc);
    }
}
