package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class Ex2CurrencyConversion {
    public static void main(String[] args) {
        double convert = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double vnd = usd * convert;
        System.out.println("Giá trị VND: " + vnd);
    }
}
