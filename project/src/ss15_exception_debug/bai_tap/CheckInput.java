package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class CheckInput {
    public int checkInput(String nameSide) {
        Scanner scanner = new Scanner(System.in);
        boolean valid=false;
        int side = 0;
        do {
            try {
                System.out.println("Nhập cạnh: " + nameSide);
                side = Integer.parseInt(scanner.nextLine());
                valid=true;
            } catch (NumberFormatException e) {
                System.out.println("Độ dài cạnh phải là một số dương");
                System.out.println("Nhập lại cạnh "+nameSide);
            }
        } while (!valid||side<=0);
        return side;
    }
}
