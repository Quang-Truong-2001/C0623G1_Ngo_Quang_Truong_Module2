package ss03_mang.bai_tap;

import java.util.Scanner;

public class Ex1DeleteAnElement {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 7, 8, 6, 0, 0, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa: ");
        int number = scanner.nextInt();
        Ex1DeleteAnElement ex1DeleteAnElement = new Ex1DeleteAnElement();
        int index = ex1DeleteAnElement.findLocation(arr, number);
        int[] newArr = ex1DeleteAnElement.deleteElement(arr, index);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }

    public int findLocation(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                index = i;
            }
        }
        return index;
    }

    public int[] deleteElement(int[] arr, int index) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        return newArr;
    }
}
