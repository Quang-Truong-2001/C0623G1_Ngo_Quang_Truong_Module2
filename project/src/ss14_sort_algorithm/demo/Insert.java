package ss14_sort_algorithm.demo;

public class Insert {
    public static void main(String[] args) {
        int[] arr={3,4,5,2,1};
        int key;
        int j;
        for(int i=0;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while (j>=0&&arr[j]<key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            for (int k=0; k< arr.length;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println("------------------");
        }
    }
}
