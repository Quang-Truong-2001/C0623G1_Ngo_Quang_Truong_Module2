package ss07_Abstract_Class_Interface.thuc_hanh.th3;

import ss07_Abstract_Class_Interface.thuc_hanh.th2.Circle;
import ss07_Abstract_Class_Interface.thuc_hanh.th2.ComparableCircle;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
        circles[0]=new Circle(3.6);
        circles[2]=new Circle();
        circles[3]=new Circle(3.5,"indigo", false);
        System.out.println("Pre-sorted:");
        for(Circle circle=new CircleComparator());
        Arrays.sort(circles, circleComparater());
        System.out.println("After-sorted:");
        for(Circle circle:circles){
            System.out.println(circle);
        }
    }
}
