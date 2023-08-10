package ss07_Abstract_Class_Interface.bai_tap.ex2;

public class SquareTest {
    public static void main(String[] args) {
        Ex2Square[] square=new Ex2Square[2];
        square[0]=new Ex2Square(6);
        System.out.println("Diện tích hình vuông");
        System.out.println(square[0].getArea());
        square[1]=new Ex2Square(3,"red");
        System.out.println("Diện tích hình vuông");
        System.out.println(square[1].getArea());
        square[1].howToColor();
    }
}
