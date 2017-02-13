package core.engines;

import core.util.RGBColor;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CanvasEngine implements GraphicsEngine {

    private GraphicsContext gc;

    public void setGraphicContext(GraphicsContext gc) {
        this.gc = gc;
    }

    @Override
    public void setFillColor(RGBColor color) {
        gc.setFill(new Color(color.R, color.G, color.B, color.opacity));
    }

    @Override
    public void setStrokeColor(RGBColor color) {
        gc.setStroke(new Color(color.R, color.G, color.B, color.opacity));
    }

    @Override
    public void setLineWidth(double lineWidth) {
        gc.setLineWidth(lineWidth);
    }

    @Override
    public void strokeRect(double x, double y, double width, double height) {
        gc.strokeRect(x, y, width, height);
    }

    @Override
    public void fillRect(double x, double y, double width, double height) {
        gc.fillRect(x, y, width, height);
    }

    @Override
    public void fillOval(double x, double y, double width, double height) {
        gc.fillOval(x, y, width, height);
    }

    @Override
    public void strokeOval(double x, double y, double width, double height) {
        gc.strokeOval(x, y, width, height);
    }

    @Override
    public void strokeLine(double x1, double y1, double x2, double y2) {
        gc.strokeLine(x1, y1, x2, y2);
    }
}
