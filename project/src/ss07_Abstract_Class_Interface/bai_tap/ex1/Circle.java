package ss07_Abstract_Class_Interface.bai_tap.ex1;

public class Circle extends ss07_Abstract_Class_Interface.bai_tap.ex1.Shape implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{"+
                "radius="+this.getRadius()+
                "Area="+this.getArea()+"}";
    }


    @Override
    public void resize(double percent) {
        this.setRadius(this.radius+this.radius*percent/100);
    }
}
