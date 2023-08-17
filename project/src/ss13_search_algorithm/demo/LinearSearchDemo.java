package ss13_search_algorithm.demo;

public class LinearSearchDemo {
    public static void main(String[] args) {
        LinearSearchDemo linearSearchDemo=new LinearSearchDemo();
        int[] arrNumbers={10,2,8,5,23,16};
        int x=23;
        int indexOfX=linearSearchDemo.search(arrNumbers,x);
        if(indexOfX>=0){
            System.out.println(x+" nằm ở vị trí " + indexOfX);
        } else{
            System.out.println("Không tìm thấy ");
        }
    }
    public int search(int[] arrNumbers,int x) {
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] == x) {
                return i;
            }
        }
        return -1;
    }
}

