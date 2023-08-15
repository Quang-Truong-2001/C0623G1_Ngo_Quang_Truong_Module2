package ss11_stack.bai_tap.ex1;

import java.util.Arrays;
import java.util.Stack;

public class Ex1Number {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int[] array=new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=i+2;
        }
        System.out.println(Arrays.toString(array));
        for(int i=0;i<array.length;i++){
            stack.push(array[i]);
        }
        for(int i=0;i<array.length;i++){
            System.out.print(stack.pop()+"  ");
        }
    }
}
