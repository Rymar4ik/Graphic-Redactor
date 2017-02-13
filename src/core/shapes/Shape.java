package core.shapes;

import core.engines.GraphicsEngine;
import core.util.RGBColor;

public abstract class Shape {

    protected RGBColor line = new RGBColor(1, 0, 0, 1);
    protected RGBColor fill = new RGBColor(0, 1, 1, 1);
    protected int lineWidth = 1;

    protected abstract void draw(GraphicsEngine ge);

    public void setLineColor(RGBColor line) {
        this.line = line;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public void setFillColor(RGBColor fill) {
        this.fill = fill;
    }

    public void show(GraphicsEngine ge) {
        ge.setFillColor(fill);
        ge.setStrokeColor(line);
        ge.setLineWidth(lineWidth);
        draw(ge);
    }


}
