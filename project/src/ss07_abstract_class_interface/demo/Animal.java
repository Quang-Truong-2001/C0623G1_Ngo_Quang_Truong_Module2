package ss07_abstract_class_interface.demo;

public abstract class Animal extends ParentAnimal implements IAnimal {
    private String color;
    private int weight;

    public Animal(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
    public abstract void sound();
    public void displayInfo(){
        System.out.println("Color: "+
                this.color+" - weight: "+
                this.weight);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
