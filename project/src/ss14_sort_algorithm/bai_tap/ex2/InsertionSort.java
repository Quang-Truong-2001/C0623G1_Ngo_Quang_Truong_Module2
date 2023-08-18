package ss14_sort_algorithm.bai_tap.ex2;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 4};
        InsertionSort demo = new InsertionSort();
        int[] newArr = demo.sortNumbers(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public int[] sortNumbers(int[] arr) {
        int key;
        int j;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
