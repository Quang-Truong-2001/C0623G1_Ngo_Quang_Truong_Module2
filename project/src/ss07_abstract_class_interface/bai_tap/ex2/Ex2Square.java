package ss07_abstract_class_interface.bai_tap.ex2;

public class Ex2Square implements Colorable {
    private double side;
    private String color;

    public Ex2Square() {
    }

    public Ex2Square(double side) {
        this.side = side;
    }

    public Ex2Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getArea(){
        return this.side*this.side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
