package ss03_mang.bai_tap;

import java.util.Scanner;

public class Ex3Merge2Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex3Merge2Arrays ex3Merge2Arrays = new Ex3Merge2Arrays();
        System.out.println("Nhập số lượng phần tử mảng 1");
        int lengthArr1 = scanner.nextInt();
        int[] arr1 = ex3Merge2Arrays.enterArr(lengthArr1);
        System.out.println("Nhập số lượng phần tử mảng 2");
        int lengthArr2 = scanner.nextInt();
        int[] arr2 = ex3Merge2Arrays.enterArr(lengthArr2);
        int[] arr3 = ex3Merge2Arrays.merge2Arrays(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }

    public int[] enterArr(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mhập phần tử ở vị trí " + i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public int[] merge2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[(arr1.length + arr2.length)];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[i - arr1.length];
        }
        return arr3;
    }
}
