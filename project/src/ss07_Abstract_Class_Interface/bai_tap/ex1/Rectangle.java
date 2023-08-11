package ss07_Abstract_Class_Interface.bai_tap.ex1;

public class Rectangle extends ss07_Abstract_Class_Interface.bai_tap.ex1.Shape implements Resizeable{
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{"+
                "width="+this.getWidth()+
                "length="+this.getLength()+
                "Area="+this.getArea()+"}";
    }


    @Override
    public void resize(double percent) {
        setWidth(this.width+this.width*percent/100);
        setLength(this.length+this.length*percent/100);
    }
}