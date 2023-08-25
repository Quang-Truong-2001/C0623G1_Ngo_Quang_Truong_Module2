package view;

import java.util.Scanner;

public class MenuEmployeeManagement {
    private final Scanner scanner=new Scanner(System.in);
    private static void displayMenuEmployeeManagement(){
        System.out.println("===Menu Employee Management======");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Delete employee");
        System.out.println("5. Search by name employee");
        System.out.println("6. Return main menu");
    }
    public static void renderMenuEmployeeManagement(){
        int option=0;
        do {
            displayMenuEmployeeManagement();
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
        } while (option<1||option>6);
    }
}
