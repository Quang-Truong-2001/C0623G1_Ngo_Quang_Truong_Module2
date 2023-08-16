package ss11_stack.demo;

import java.util.List;

public interface IService<E>{
    void create(E e);
    void remove(int id);
    List<E> getAll();
}
