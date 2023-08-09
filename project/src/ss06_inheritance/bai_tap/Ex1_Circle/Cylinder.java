package ss06_inheritance.bai_tap.Ex1_Circle;

public class Cylinder extends Circle{
    private int height;

    public Cylinder(float radius, String color, int height) {
        super(radius, color);
        this.height=height;
    }
    public Cylinder() {
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "height = "+this.height+
                super.toString();
    }
}
