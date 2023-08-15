package ss11_stack.bai_tap.ex5;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {

        String str="s*(s–a*(s–b)*(s–c)";
        char[] arr=str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);;
        }
        System.out.println();
        if(checkBracket(arr)){
            System.out.println("Bracket is well");
        } else {
            System.out.println("Bracket is well");
        }
    }
    public static boolean checkBracket(char[] arr){
        Stack<Character> bStack=new Stack<>();
        Stack<Character> left=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='('){
                bStack.push(arr[i]);
            } else if (arr[i]==')'){
                if(bStack.isEmpty()){
                    return false;
                } else {
                    left.push(arr[i]);
                }
            }
            if(arr[i]==left){
                return true;
            } else {
                return false;
            }
        }

    }
}
