package ss14_sort_algorithm.demo;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={3,4,5,2,1};
        boolean swapped;
        int temp;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                    for (int k=0; k< arr.length;k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
            System.out.println("-------------");
            if(swapped==false){
                break;
            }
        }
    }
}
