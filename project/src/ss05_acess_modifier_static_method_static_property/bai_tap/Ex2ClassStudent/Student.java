package ss05_acess_modifier_static_method_static_property.bai_tap.Ex2ClassStudent;

public class Student {
    private String name="john";
    private String classes="C02";

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    void setName(String name) {
        this.name = name;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }
}
