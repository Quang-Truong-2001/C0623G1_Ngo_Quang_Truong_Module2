package ss05_acess_modifier_static_method_static_property.bai_tap.Ex2ClassStudent;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
//        student.setName("Truong");
        System.out.println(student.getName());
//        student.setClasses("C0623G1");
        System.out.println(student.getClasses());
    }
}
