package view;

import java.util.Scanner;

public class MenuFacilityManagement {
    private final Scanner scanner = new Scanner(System.in);
    private static void displayMenuFacilityManagement(){
        System.out.println("===Menu Facility Management======");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Delete facility");
        System.out.println("5. Return main menu");
    }
    public static void renderMenuEmployeeManagement() {
        int option = 0;
        do {
            displayMenuFacilityManagement();
            option = FunctionCheckOption.checkOption();
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
                    FuramaView.render();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (option < 1 || option > 5);
    }
}
