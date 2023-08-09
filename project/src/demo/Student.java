package demo;

public class Student {
    private String fullName;
    private int age;
    private String clazzName;

    public Student() {
    }

    public Student(String fullName, int age, String clazzName) {
        this.fullName = fullName;
        this.age = age;
        this.clazzName = clazzName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) throws Exception{
        if(age<=0){
            throw new Exception("Age is invalid");
        }
        this.age=age;
    }
}
