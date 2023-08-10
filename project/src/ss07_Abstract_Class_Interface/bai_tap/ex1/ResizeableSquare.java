package ss07_Abstract_Class_Interface.bai_tap.ex1;

public class ResizeableSquare {
    public static void main(String[] args) {
        ss07_Abstract_Class_Interface.bai_tap.ex1.Square[] square=new ss07_Abstract_Class_Interface.bai_tap.ex1.Square[2];
        square[0]=new ss07_Abstract_Class_Interface.bai_tap.ex1.Square(3);
        System.out.println("Diện tích hình vuông trước khi tăng kích thước:");
        System.out.println(square[0].getArea());
        System.out.println("Diện tích hình vuông sau khi tăng kích thước:");
        System.out.println(square[0].resize());
    }
}
