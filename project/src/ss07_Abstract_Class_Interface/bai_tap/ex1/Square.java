package ss07_Abstract_Class_Interface.bai_tap.ex1;

public class Square extends ss07_Abstract_Class_Interface.bai_tap.ex1.Shape implements Resizeable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return this.side*this.side;
    }

    @Override
    public double resize() {
        return this.getArea()+this.getArea()*Math.random();
    }
}
