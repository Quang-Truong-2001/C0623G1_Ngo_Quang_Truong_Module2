package ss07_Abstract_Class_Interface.demo2;

public class MathOperator {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        MathOperator mathOperator=new MathOperator();
        mathOperator.add(2,3);
    }
}
