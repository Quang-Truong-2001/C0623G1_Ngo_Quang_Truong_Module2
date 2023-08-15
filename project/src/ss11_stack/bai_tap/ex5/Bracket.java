package ss11_stack.bai_tap.ex5;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {

        String str = "(s–a)*(s–b)*(s–c)";
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        if (checkBracket(arr)) {
            System.out.println("Bracket is well");
        } else {
            System.out.println("Bracket is not well");
        }
    }

    public static boolean checkBracket(String[] arr) {
        Stack<String> bStack = new Stack<>();
        Stack<String> left = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                bStack.push(arr[i]);
            } else if (arr[i].equals(")")) {
                if (bStack.empty()) {
                    return false;
                } else {
                    left.push(arr[i]);
                }
            }
        }
        if (bStack.size() == left.size()) {
            return true;
        } else {
            return false;
        }

    }
}