package ss02_vong_lap.bai_tap;

import java.util.Scanner;

public class Ex1DisplayDrawing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while(choice!=0){
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 0; i < 5; i++) {
                        for (int k = 4; k > i; k--) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 0; i < 5; i++) {
                        for (int k = 0; k < i; k++) {
                            System.out.print("  ");
                        }
                        for (int j = 5; j > i; j--) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 7; i++) {
                        for (int k = 7; k > i; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }
}
