package ss03_mang.bai_tap;

import java.util.Scanner;

public class Ex2AddElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chèn");
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();
        if (index <= -1 && index >= arr.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            Ex2AddElement ex2AddElement = new Ex2AddElement();
            int[] newArr = ex2AddElement.addElement(arr,number, index);
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i]+"\t");
            }
        }
    }

    public int[] addElement(int[] arr, int number, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = number;
        for (int i = newArr.length - 1; i > index; i--) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}
