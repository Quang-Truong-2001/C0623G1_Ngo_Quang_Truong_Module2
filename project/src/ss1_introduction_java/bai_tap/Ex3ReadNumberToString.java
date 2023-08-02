package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class Ex3ReadNumberToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int number = sc.nextInt();
        int numberHunderedsInterger = (number / 100) * 100;
        int numberHunderedsRemainder = number % 100;
        int numberDozensInterger = (numberHunderedsRemainder / 10) * 10;
        int numberDozensRemainder = numberHunderedsRemainder % 10;
        System.out.println(numberHunderedsInterger);
        System.out.println(numberHunderedsRemainder);
        System.out.println(numberDozensInterger);
        System.out.println(numberDozensRemainder);
        if (number >= 100 & number < 1000) {
            switch (numberHunderedsInterger) {
                case 100:
                    System.out.print("One hundered ");
                    break;
                case 200:
                    System.out.print("Two hundered");
                    break;
                case 300:
                    System.out.print("three hundered");
                    break;
                case 400:
                    System.out.print("four hundered");
                    break;
                case 500:
                    System.out.print("five hundered");
                    break;
                case 600:
                    System.out.print("six hundered");
                    break;
                case 700:
                    System.out.print("seven hundered");
                    break;
                case 800:
                    System.out.print("eight hundered");
                    break;
                case 900:
                    System.out.print("nine hundered");
                    break;
            }
        }
        if (numberHunderedsRemainder > 10 && numberHunderedsRemainder < 20) {
            switch (numberHunderedsRemainder) {
                case 11:
                    System.out.print(" Eleven");
                    break;
                case 12:
                    System.out.print(" Twelve");
                    break;
                case 13:
                    System.out.print(" thirteen");
                    break;
                case 14:
                    System.out.print(" fourteen");
                    break;
                case 15:
                    System.out.print(" fifteen");
                    break;
                case 16:
                    System.out.print(" sixteen");
                    break;
                case 17:
                    System.out.print(" seventeen");
                    break;
                case 18:
                    System.out.print(" eighteen");
                    break;
                case 19:
                    System.out.print(" nineteen");
                    break;
            }
        }
        if (numberHunderedsRemainder >= 20 && numberHunderedsRemainder < 100) {
            switch (numberDozensInterger) {
                case 20:
                    System.out.print(" twenty ");
                    break;
                case 30:
                    System.out.print(" thirty ");
                    break;
                case 40:
                    System.out.print(" forty ");
                    break;
                case 50:
                    System.out.print(" fifty ");
                    break;
                case 60:
                    System.out.print(" sixty ");
                    break;
                case 70:
                    System.out.print(" seventy ");
                    break;
                case 80:
                    System.out.print(" eighty ");
                    break;
                case 90:
                    System.out.print(" ninety ");
                    break;
            }
            switch (numberDozensRemainder) {
                case 1:
                    System.out.print(" one ");
                    break;
                case 2:
                    System.out.print(" two ");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print(" four");
                    break;
                case 5:
                    System.out.print(" five");
                    break;
                case 6:
                    System.out.print(" six");
                    break;
                case 7:
                    System.out.print(" seven");
                    break;
                case 8:
                    System.out.print(" eight");
                    break;
                case 9:
                    System.out.print(" nine");
                    break;
            }
        }
        if (number<=10){
            switch (number){
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                case 10:
                    System.out.println("ten");
            }
        }
    }
}
