package service.person.impl;

import model.Employee;
import repository.person.IEmployeeRepository;
import repository.person.impl.EmployeeRepositoryImpl;
import service.person.IServiceEmployee;

import java.util.List;

public class ServiceEmployeeImpl implements IServiceEmployee {
    private final IEmployeeRepository iEmployeeRepository=new EmployeeRepositoryImpl();
    @Override
    public List<Employee> getList() {
        return this.iEmployeeRepository.getList();
    }

    @Override
    public void addNew(Employee employee) {
        this.iEmployeeRepository.addNew(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        this.iEmployeeRepository.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(String id) {
        this.iEmployeeRepository.deleteEmployee(id);
    }

    @Override
    public List<Employee> searchByNameEmployee(String nameEmployee) {
        return this.iEmployeeRepository.searchByNameEmployee(nameEmployee);
    }
}
