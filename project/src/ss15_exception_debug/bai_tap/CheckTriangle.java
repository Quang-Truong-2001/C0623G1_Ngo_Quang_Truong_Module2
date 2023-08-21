package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int sideA=scanner.nextInt();
        System.out.println("Nhập cạnh b: ");
        int sideB=scanner.nextInt();
        System.out.println("Nhập cạnh c: ");
        int sideC=scanner.nextInt();
        CheckTriangle checkTriangle=new CheckTriangle();
        checkTriangle.check(sideA,sideA,sideC);
    }
    private void check(int sideA, int sideB, int sideC){
        try{
            System.out.println("Cạnh a: "+sideA);
            System.out.println("Cạnh b: "+sideB);
            System.out.println("Cạnh c: "+sideC);
        }catch (Exception e){
            System.out.println("Xảy ra ngoại lệ");
        }
    }
}
