package ss05_acess_modifier_static_method_static_property.bai_tap.Ex1Circle;

public class Circle {
    private double radius=1.0d;
    private String color="red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
