package ss13_search_algorithm.bai_tap.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class SearchBinaryAlgorithm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SearchBinaryAlgorithm searchBinaryAlgorithm=new SearchBinaryAlgorithm();
        System.out.println("Nhập độ dài của mảng");
        int length=scanner.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Nhập phần tử ở vị trí "+i);
            arr[i]=scanner.nextInt();
        }
        searchBinaryAlgorithm.displayArr(arr);
        int[] arrArrange=searchBinaryAlgorithm.arrangeArr(arr);
        searchBinaryAlgorithm.displayArr(arrArrange);
        System.out.println("Nhập số cần tìm");
        int x=scanner.nextInt();
        int indexOfX=searchBinaryAlgorithm.binarySearch(arr,x,0,arrArrange.length-1);
        if(indexOfX>=0){
            System.out.println(x+ " nằm ở vị trí số "+ indexOfX);
        } else {
            System.out.println("Không tìm được ");
        }
    }
    public int binarySearch(int[] arr,int x, int left, int right){
        int mid=left+(right-left)/2;
        while(left<=right){
            if(arr[mid]==x){
                return mid;
            }
            if(x>arr[mid]){
                return binarySearch(arr,x,mid+1,right);
            } else {
                return binarySearch(arr,x,left,mid-1);
            }
        }
        return -1;
    }
    public int[] arrangeArr(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public void displayArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
