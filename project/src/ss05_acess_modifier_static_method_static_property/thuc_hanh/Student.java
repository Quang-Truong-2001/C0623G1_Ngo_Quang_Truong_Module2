package ss05_acess_modifier_static_method_static_property.thuc_hanh;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";

    Student(int r,String n){
        rollno=r;
        name=n;
    }

    static void change(){
        college="CODEGYM";
    }
    void display(){
        System.out.println(rollno+ " " +name+" "+college);
    }
}
