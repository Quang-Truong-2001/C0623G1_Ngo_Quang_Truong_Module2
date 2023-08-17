package ss07_abstract_class_interface.bai_tap.ex1;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes=new Resizeable[3];
        shapes[0]=new Square(5);
        shapes[1]= new Circle(4);
        shapes[2]=new Rectangle(4,6);
        for(Resizeable value: shapes){
            System.out.println("\n Befor size increase = "+ value);
            double percent=Math.random()*100;
            value.resize(percent);
            System.out.println("\n After size increase ="+ value);
        }
    }
}
