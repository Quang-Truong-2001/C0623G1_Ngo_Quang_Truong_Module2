package view;

import java.util.Scanner;

public class MenuCustomerManagement {
    private final Scanner scanner = new Scanner(System.in);
    private static void displayMenuCustomerManagement(){
        System.out.println("===Menu Customer Management======");
        System.out.println("1. Display list Customer");
        System.out.println("2. Add new Customer");
        System.out.println("3. Edit Customer");
        System.out.println("4. Delete Customer");
        System.out.println("5. Search by name Customer");
        System.out.println("6. Return main menu");
    }
    public static void renderMenuEmployeeManagement() {
        int option = 0;
        do {
            displayMenuCustomerManagement();
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
                    break;
                case 6:
                    FuramaView.render();
                    break;
            }
        } while (option < 1 || option > 6);
    }
}
