package ss06_inheritance.bai_tap.Ex1_Circle;

public class Circle {
    private float radius;
    private String color;

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "radius = "+this.radius+
                "color: "+this.color;
    }
}
