package ss02_vong_lap.bai_tap;

import java.util.Scanner;

public class Ex2ListNumberPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount;
        int count = 0;
        int n = 2;
        System.out.println("Enter amount prime numbers");
        amount = input.nextInt();
        while (count < amount) {
            int countOne = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    countOne++;
                }
            }
            if (countOne == 0) {
                System.out.println(n + " là số nguyên tố");
                count++;
            }
            countOne = 0;
            n++;
        }
    }
}
