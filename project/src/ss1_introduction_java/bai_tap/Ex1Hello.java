package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class Ex1Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
