package controller.person;

import controller.IController;
import model.Employee;

import java.util.List;

public interface IControllerEmployee extends IController<Employee> {
    void updateEmployee(Employee employee);
    void deleteEmployee(String id);
    List<Employee> searchByNameEmployee(String nameEmployee);
}
