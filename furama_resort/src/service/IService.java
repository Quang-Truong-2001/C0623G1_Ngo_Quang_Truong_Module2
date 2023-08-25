package service;

import java.util.List;

public interface IService<E> {
    List<E> getList();
    void addNew(E e);
}
