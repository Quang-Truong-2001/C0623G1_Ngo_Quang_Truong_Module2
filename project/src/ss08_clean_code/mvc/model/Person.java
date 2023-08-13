package ss08_clean_code.mvc.model;

public abstract class Person {
    private String name;
    private String birthDay;
    private String gender;

    public Person(String name, String birthDay, String gender) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
