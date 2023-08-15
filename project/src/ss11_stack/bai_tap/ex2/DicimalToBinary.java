package ss11_stack.bai_tap.ex2;

import java.util.Stack;

public class DicimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> binary = new Stack<>();
        int binarySave = 0;
        int result = 30;
        while (result > 0) {
            binarySave = result % 2;
            result=result/2;
            binary.push(binarySave);
        }
        int length=binary.size();
        for(int i=0;i<length;i++){
            System.out.println(binary.pop());
        }
    }
}