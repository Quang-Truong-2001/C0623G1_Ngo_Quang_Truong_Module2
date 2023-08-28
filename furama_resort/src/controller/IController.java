package controller;

import java.util.List;

public interface IController<E> {
    List<E> getList();
    void addNew(E e);
}
