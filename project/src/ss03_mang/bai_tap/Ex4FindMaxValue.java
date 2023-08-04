package ss03_mang.bai_tap;

import java.util.Scanner;

public class Ex4FindMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng của mảng");
        int width = scanner.nextInt();
        System.out.println("Nhập chiều cao của mảng");
        int height = scanner.nextInt();
        int[][] array2D = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Nhập phần tử ở vị trí "+ i + " " + j);
                array2D[i][j] = scanner.nextInt();
            }
        }
        System.out.println("");
        int max = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                    System.out.println("Giá trị lớn nhất:" + max);
                }
            }
        }
    }
}
