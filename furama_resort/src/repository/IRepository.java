package repository;

import java.util.List;

public interface IRepository<E> {
    List<E> getList();
    void addNew(E e);
}
