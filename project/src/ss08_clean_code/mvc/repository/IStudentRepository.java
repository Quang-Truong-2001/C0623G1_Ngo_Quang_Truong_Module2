package ss08_clean_code.mvc.repository;

import java.util.List;

public interface IStudentRepository<E> {

    void addInfoStudent(E e);

    void deleteStudent(String id);
    List<E> displayAllStudent();


}
