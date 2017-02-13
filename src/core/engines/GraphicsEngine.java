package core.engines;

import core.util.RGBColor;

public interface GraphicsEngine {

    void setFillColor (RGBColor color);
    void setStrokeColor(RGBColor color);
    void setLineWidth(double lineWidth);

    void strokeRect(double x, double y, double width, double height);
    void fillRect(double x, double y, double width, double height);

    void fillOval(double x, double y, double width, double height);
    void strokeOval(double x, double y, double width, double height);
    void strokeLine(double x1, double y1, double x2, double y2);
}
