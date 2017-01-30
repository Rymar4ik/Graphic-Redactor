package core.shapes;
//TODO: Целесообразнсоть абстрактного класа Oval, как и Rectangle, в целом?
public abstract class Oval extends Shape {


    protected Point p;
    protected double width, height;

    //TODO: Целесообразность второго конструктора?! О_о
    public Oval(Point center, double radius) {
        p = center;
        width = radius;
        height = radius;
    }

    public Oval(Point center, double width, double height){
        p = center;
        this.width = width;
        this.height = height;

    }

}
