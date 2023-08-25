package service.person;

import model.Employee;
import service.IService;

import java.util.List;

public interface IServiceEmployee extends IService<Employee> {
    void updateEmployee(Employee employee);
    void deleteEmployee(String id);
    List<Employee> searchByNameEmployee(String nameEmployee);
}
