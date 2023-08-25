package view;

import java.util.Scanner;

public class MenuPromotionManagement {
    private final Scanner scanner = new Scanner(System.in);
    private static void displayMenuPromotionManagement(){
        System.out.println("===Menu Booking Management======");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
    }
    public static void renderMenuEmployeeManagement() {
        int option = 0;
        do {
            displayMenuPromotionManagement();
            option = FunctionCheckOption.checkOption();
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    FuramaView.render();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (option < 1 || option > 3);
    }
}
