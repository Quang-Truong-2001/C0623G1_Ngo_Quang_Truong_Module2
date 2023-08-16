package ss12_BinaryTree.productManager.repository;

import java.util.List;

public interface IProductRepository<E> {
    void addProductRepo(E e);
    void editInfoRepo(String id, String name, int price);
    void deleteRepo(String id);
    List<E> displayRepo();
    void searchRepo(String id);
    List<E> sortUpProductRepo();
    List<E> sortDownProductRepo();
}
