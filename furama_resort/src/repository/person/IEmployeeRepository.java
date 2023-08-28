package repository.person;

import model.Employee;
import repository.IRepository;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {
    void updateEmployee(Employee employee);
    void deleteEmployee(String id);
    List<Employee> searchByNameEmployee(String nameEmployee);
}
