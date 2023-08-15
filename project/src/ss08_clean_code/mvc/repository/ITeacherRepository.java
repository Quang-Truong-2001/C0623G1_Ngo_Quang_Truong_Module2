package ss08_clean_code.mvc.repository;

import java.util.List;

public interface ITeacherRepository<E> {

    void addInfoTeacher(E e);

    void deleteTeacher(String id);

    List<E> displayAllTeacher();
}
