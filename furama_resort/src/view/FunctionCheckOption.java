package view;

import java.util.Scanner;

public class FunctionCheckOption {
    public static int checkOption(){
        Scanner scanner=new Scanner(System.in);
        int option=0;
        boolean valid=false;
        do{
            try {
                System.out.println("Nhập chức năng");
                option = Integer.parseInt(scanner.nextLine());
                valid=true;
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        } while(!valid);
        return option;
    }
}
