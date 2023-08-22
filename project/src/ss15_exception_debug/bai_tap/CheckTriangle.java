package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class CheckTriangle {

    public static void main(String[] args) {
        CheckInput checkInput=new CheckInput();
        int sideA=0;
        int sideB=0;
        int sideC=0;
        do{
            try{
                sideA=checkInput.checkInput("SideA");
                sideB=checkInput.checkInput("SideB");
                sideC=checkInput.checkInput("SideC");
                Triangle triangle=new Triangle(sideA, sideB, sideC);
            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("Ngoại lệ không xác định "+e.getMessage());
            }
        }while(sideA+sideB<=sideC||sideB+sideC<sideA||sideC+sideA<sideB);
    }

}
