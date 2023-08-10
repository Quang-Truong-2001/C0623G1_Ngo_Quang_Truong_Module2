package ss07_Abstract_Class_Interface.bai_tap.ex1;

public class ResizeableRectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles=new Rectangle[2];
        rectangles[0]=new Rectangle(2,5);
        System.out.println("Diện tích hình chữ nhật trước khi tăng kích thước:");
        System.out.println(rectangles[0].getArea());
        System.out.println("Diện tích hình chữ nhật sau khi tăng kích thước:");
        System.out.println(rectangles[0].resize());
    }
}
