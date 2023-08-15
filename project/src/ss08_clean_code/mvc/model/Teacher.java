package ss08_clean_code.mvc.model;

import ss08_clean_code.mvc.model.Person;

public class Teacher extends Person {
    private String speciality;

    public Teacher(String id, String name, String birthDay, String gender, String speciality) {
        super(id, name, birthDay, gender);
        this.speciality = speciality;
    }

    public Teacher() {
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString() +
                "speciality='" + speciality + '\'' +
                '}'+"\n";
    }
}
