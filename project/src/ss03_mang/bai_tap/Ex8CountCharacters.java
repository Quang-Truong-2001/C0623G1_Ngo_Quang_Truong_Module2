package ss03_mang.bai_tap;

import java.util.Scanner;

public class Ex8CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi");
        String string = scanner.nextLine();

        System.out.println("Nhập ký tự");
        char character = scanner.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện " + count);
    }
}
