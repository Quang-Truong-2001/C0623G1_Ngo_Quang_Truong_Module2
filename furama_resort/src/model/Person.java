package model;

public abstract class Person {
    private String id;
    private String name;
    private String birthDay;
    private String Gender;
    private String identityCardNumber;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String birthDay, String gender, String identityCardNumber, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.Gender = gender;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "id: " + id + "\t"+
                "name: " + name + "\t"+
                "birthDay: " + birthDay + "\t"+
                "Gender: " + Gender + "\t"+
                "identityCardNumber: " + identityCardNumber + "\t"+
                "phoneNumber: " + phoneNumber + "\t"+
                "email: " + email +"\t";
    }
}
