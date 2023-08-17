package ss12_binarytree.demo;

public class StudentIdCard implements Comparable<StudentIdCard>{
    private int id;

    public StudentIdCard(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentIdCard{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(StudentIdCard o) {
        return o.id-this.id;
    }
}
