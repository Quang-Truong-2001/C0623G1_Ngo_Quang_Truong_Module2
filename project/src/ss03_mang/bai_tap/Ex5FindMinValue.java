package ss03_mang.bai_tap;

import java.util.Scanner;

public class Ex5FindMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của mảng");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần thử thứ " + i);
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất có giá trị bằng " + min);
    }
}
