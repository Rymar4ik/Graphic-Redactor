package core.shapes;

import core.engines.GraphicsEngine;

public class Oval extends Shape {
    private Point p;
    private double width, height;
    private boolean fill;

    public Oval(Point p, double radius, boolean fill) {
        this(p,radius, radius,fill);
    }

    public Oval(Point center, double width, double height, boolean fill){
        p = center;
        this.width = width;
        this.height = height;
        this.fill = fill;
    }

    @Override
    protected void draw(GraphicsEngine ge) {
        if(fill)
            ge.fillOval(p.getX(),p.getY(), width, height);
        else
            ge.strokeOval(p.getX(),p.getY(), width, height);
    }
}
