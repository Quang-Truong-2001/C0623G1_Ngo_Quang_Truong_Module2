package ss11_stack.bai_tap.ex4;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String str = "123321";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack=new Stack<>();
        char[] charString=str.toCharArray();
        for (int i = 0; i < charString.length; i++) {
            stack.push(charString[i]);
            queue.add(charString[i]);
        }
        boolean isPalindromw=false;
        for (int i = 0; i < charString.length; i++) {
            if(stack.pop()!=queue.poll()){
                isPalindromw=false;
                break;
            }
        }
        if(isPalindromw){
            System.out.println("là chuỗi Palindrome");
        } else {
            System.out.println("Không phải là chuỗi Palindrome");
        }
    }
}
