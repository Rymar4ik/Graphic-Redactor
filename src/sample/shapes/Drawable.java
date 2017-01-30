package sample.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Created by StaslaMasla on 30.01.2017.
 */
public interface Drawable {

    void draw(GraphicsContext graphicsContext);

    void setLineColor(Color line);

    void setFillColor(Color fill);

    void setLineWidth(int lineWidth);

    void applyDrawSettings(GraphicsContext graphicsContext);
}
