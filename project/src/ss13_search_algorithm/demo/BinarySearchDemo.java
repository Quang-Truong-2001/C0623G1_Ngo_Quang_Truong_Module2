package ss13_search_algorithm.demo;

public class BinarySearchDemo {
    public static void main(String[] args) {
        BinarySearchDemo binarySearchDemo=new BinarySearchDemo();
        int[] arrNumbers={2,8,5,23,16};
        int x=23;
        int indexOfX=binarySearchDemo.search2(arrNumbers,x,0, arrNumbers.length-1);
        if(indexOfX>=0){
            System.out.println(x+" nằm ở vị trí " + indexOfX);
        } else{
            System.out.println("Không tìm thấy ");
        }
    }

    public int search(int[] arrNumbers, int x){
        int left=0;
        int right=arrNumbers.length-1;
        int mid;
        while (left<=right){
            mid=left+(right-left)/2;
            if(arrNumbers[mid]==x){
                return mid;
            }
            if(x>arrNumbers[mid]){
                left=mid+1;
            } else if(x < arrNumbers[mid]){
                right=mid-1;
            }
        }
        return -1;
    }
    public int search2(int[] arrNumber, int x, int left, int right){
        int mid=left+(right-left)/2;
        if (arrNumber[mid]==x){
            return mid;
        }
        if(x<arrNumber[mid]){
            return search2(arrNumber,x,left,mid-1);
        }
        return search2(arrNumber,x,mid+1,right);
    }
}
