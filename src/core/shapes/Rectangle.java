package core.shapes;

public abstract class Rectangle extends Shape {

    private Point p;
    private double width;
    private double height;

    public Rectangle(Point p, double width, double height) {
        this.p = p;
        this.width = width;
        this.height = height;
    }

}
