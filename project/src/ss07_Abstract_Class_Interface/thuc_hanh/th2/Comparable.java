package ss07_Abstract_Class_Interface.thuc_hanh.th2;

import java.util.Comparator;

public class CircleComparator {
    @Override
    public int compare(Circle c1, Circle c2){
        if(c1.getRadius()> c2.getRadius()){
            return 1;
        } else if (c1.getRadius()<c2.getRadius()) {
            return -1;
        } else return 0;
    }
}