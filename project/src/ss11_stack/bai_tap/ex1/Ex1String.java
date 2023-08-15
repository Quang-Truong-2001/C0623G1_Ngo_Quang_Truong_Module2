package ss11_stack.bai_tap.ex1;

import java.util.Arrays;
import java.util.Stack;

public class Ex1String {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        String str="ngoquangtruong";
        char[] arr=str.toCharArray();
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(stack.pop());
        }
    }
}
