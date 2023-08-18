package ss14_sort_algorithm.bai_tap.ex1;

public class InsertionSort {
    void insertionSort(int[] arr){
        System.out.println();
        int key;
        int j;
        for(int i=1;i<arr.length;i++){
            System.out.println("Bắt đầu vòng lặp thứ "+i);
            key=arr[i];
            j=i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                System.out.println("Swap " +key+ " with "+ arr[j+1]);
                j--;
            }
            arr[j+1]=key;
            System.out.println("Kết thúc vòng lặp thứ "+i);
            System.out.println();
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }
    void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String[] args) {
        int[] arr={10,5,2,1,4,9,8,1};
        InsertionSort insertionSort=new InsertionSort();
        insertionSort.printArray(arr);
        insertionSort.insertionSort(arr);
        System.out.println();
        insertionSort.printArray(arr);
    }
}
