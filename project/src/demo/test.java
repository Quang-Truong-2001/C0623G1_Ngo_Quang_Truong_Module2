package demo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int lengthArray = scanner.nextInt();
        if (lengthArray >= 0 && lengthArray <= 1000) {
            int[] array = new int[lengthArray];
            for (int i = 0; i < lengthArray; i++) {
                System.out.println("Nhập phần tử ở vị trí " + i);
                array[i] = scanner.nextInt();
            }
            System.out.println("Nhập phần tử ở vị trí:");
            int number = scanner.nextInt();
            int index = number - 1;
            int sumOne = 0;
            for (int i = 0; i < index; i++) {
                sumOne = sumOne + array[i];
            }
            int sumTwo = 0;
            for (int i = index + 1; i < lengthArray; i++) {
                sumTwo = sumTwo + array[i];
            }
            if (sumOne == sumTwo) {
                System.out.println("Mảng đẹp");
            } else {
                System.out.println("Mảng không đẹp");
            }
        }
    }
}
