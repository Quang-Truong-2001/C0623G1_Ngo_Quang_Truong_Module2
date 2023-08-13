package ss08_clean_code.mvc.model;

import ss08_clean_code.mvc.model.Person;

public class Student extends Person {
    private String clazz;
    private float point;
    public Student(String name, String birthDay, String gender, String clazz, float point) {
        super(name, birthDay, gender);
        this.clazz=clazz;
        this.point=point;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }
}
