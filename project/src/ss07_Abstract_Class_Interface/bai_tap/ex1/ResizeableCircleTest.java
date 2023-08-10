package ss07_Abstract_Class_Interface.bai_tap.ex1;

public class ResizeableCircleTest {
    public static void main(String[] args) {
        Circle[] circles=new Circle[2];
        circles[0]=new Circle(2);
        circles[1]=new Circle(4);
        System.out.println("Diện tích hình tròn trước khi tăng kích thước:");
        System.out.println(circles[0].getArea());
        System.out.println("Diện tích hình tròn sau khi tăng kích thước:");
        System.out.println(circles[0].resize());
        System.out.println("Diện tích hình tròn trước khi tăng kích thước:");
        System.out.println(circles[1].getArea());
        System.out.println("Diện tích hình tròn sau khi tăng kích thước:");
        System.out.println(circles[1].resize());
    }
}
