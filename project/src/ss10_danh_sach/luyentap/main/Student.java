package ss10_danh_sach.luyentap.main;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String idStudent;
    private String name;
    private int DateBirth;
    private float averagePoint;

    public Student(String idStudent, String name, int dateBirth, float averagePoint) {
        this.idStudent = idStudent;
        this.name = name;
        DateBirth = dateBirth;
        this.averagePoint = averagePoint;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateBirth() {
        return DateBirth;
    }

    public void setDateBirth(int dateBirth) {
        DateBirth = dateBirth;
    }

    public float getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(float averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + idStudent + '\'' +
                ", name='" + name + '\'' +
                ", DateBirth=" + DateBirth +
                ", averagePoint=" + averagePoint +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.idStudent.compareTo(o.idStudent);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idStudent.equals(student.idStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent);
    }
}
