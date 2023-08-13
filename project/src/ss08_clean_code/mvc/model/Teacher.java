package ss08_clean_code.mvc.model;

import ss08_clean_code.mvc.model.Person;

public class Teacher extends Person {
    private String speciality;

    public Teacher(String name, String birthDay, String gender, String speciality) {
        super(name, birthDay, gender);
        this.speciality=speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
