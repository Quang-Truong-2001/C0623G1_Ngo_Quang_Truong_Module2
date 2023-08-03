package ss02_vong_lap.bai_tap;

import java.util.Scanner;

public class Ex3PrimeNumberFrom1To100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number: ");
            number = input.nextInt();
            int count = 0;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(number + " là số nguyên tố");
            } else {
                System.out.println(number + " không phải là số nguyên tố");
            }
        } while (number > 1 && number < 100);
    }
}
