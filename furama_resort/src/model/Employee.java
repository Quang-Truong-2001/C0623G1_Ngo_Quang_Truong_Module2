package model;

public class Employee extends Person{
    private String qualifications;
    private String position;
    private int wage;

    public Employee() {
    }

    public Employee(String id, String name, String birthDay, String gender, int identityCardNumber, int phoneNumber, String email, String qualifications, String position, int wage) {
        super(id, name, birthDay, gender, identityCardNumber, phoneNumber, email);
        this.qualifications = qualifications;
        this.position = position;
        this.wage = wage;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return  super.toString()+"qualifications: " + qualifications + "\t" +
                "position: " + position + "\t" +
                "wage: " + wage;
    }
}
