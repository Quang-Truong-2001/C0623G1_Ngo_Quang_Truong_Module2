package ss05_acess_modifier_static_method_static_property.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1=new Car("Mazda 3","Skyactive 3");
        System.out.println(Car.numberOfCars);
        Car car2=new Car("Mazda 6","Skyactive 6");
        System.out.println(Car.numberOfCars);
    }
}
