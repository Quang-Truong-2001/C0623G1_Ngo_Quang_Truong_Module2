package ss07_Abstract_Class_Interface.demo;

public class Pig extends Animal{
    public Pig(String color, int weight) {
        super(color, weight);
    }

    @Override
    public void sound() {
        System.out.println("Let's ec");
    }

    @Override
    public void move() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }
}
