package view;

import java.util.Scanner;

public class MenuBookingManagement {
    private final Scanner scanner = new Scanner(System.in);
    private static void displayMenuBookingManagement(){
        System.out.println("===Menu Booking Management======");
        System.out.println("1. Add new facility");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new booking");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
    }
    public static void renderMenuEmployeeManagement() {
        int option = 0;
        do {
            displayMenuBookingManagement();
            option=FunctionCheckOption.checkOption();
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    FuramaView.render();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (option < 1 || option > 6);
    }
}
