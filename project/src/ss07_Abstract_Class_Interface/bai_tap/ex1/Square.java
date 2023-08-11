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
    public void resize(double percent) {
        this.setSide(this.side+this.side*(percent/100));
    }

    @Override
    public String toString() {
        return "Square{"+
                "height="+this.getSide()+
                "Area="+this.getArea()+"}";
    }
}
