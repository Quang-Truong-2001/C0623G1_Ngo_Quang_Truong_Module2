package ss02_vong_lap.thuc_hanh;

import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println(number + " ís not a prime");
        } else {
//            int i = 2;
//            boolean check = true;
//            while (i<number){
//                if (number%i==0){
//                    check=false;
//                    break;
//                }
//                i++;
//            }
//            if (check)
//                System.out.println(number+" is a prime");
//            else
//                System.out.println(number+ " is not a prime");
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }
    }
}
