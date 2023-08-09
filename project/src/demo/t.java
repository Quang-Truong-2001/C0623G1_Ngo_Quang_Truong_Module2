package demo;
import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3};
        int sumLeft = 0;
        int sumRight = 0;
        boolean solution ( int[] a){
            for (int i = 0; i < a.length; i++) {
                sumRight += a[i];
            }
            for (int i = 0; i < a.length; i++) {
                sumRight -= a[i];
                if (sumLeft == = sumRight) {
                    return true;
                }
                sumLeft += a[i];
            }
            return false;
        }
        solution
    }
}
