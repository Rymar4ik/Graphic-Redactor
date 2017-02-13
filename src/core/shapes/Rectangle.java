package core.shapes;

import core.engines.GraphicsEngine;

public class Rectangle extends Shape {

    private Point p;
    private double width,height;
    private boolean fill;


    public Rectangle(Point p, double width, double height, boolean fill) {
        this.p = p;
        this.width = width;
        this.height = height;
        this.fill = fill;
    }

    public Rectangle(Point p, double sideLength, boolean fill){
        this.p = p;
        width = sideLength;
        height = sideLength;
        this.fill = fill;
    }

    @Override
    public void draw(GraphicsEngine ge) {
        if(fill)
            ge.fillRect(p.getX(), p.getY(), width, height);
        else
            ge.strokeRect(p.getX(), p.getY(), width, height);
    }
}
