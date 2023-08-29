package repository.person.impl;

import Utils.FileUtils;
import model.Employee;

import repository.convert.EmployeeCovert;
import repository.person.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private final static String EMPLOYEE_DATA_PATH="E:\\C0623G1_Ngo_Quang_Truong_Module2\\furama_resort\\src\\data\\employee.csv";
//    private final List<Employee> employees=new ArrayList<>();
    @Override
    public void updateEmployee(Employee employee) {
        List<Employee> employees=this.getList();
        for(Employee e:employees){
            if(e.getId().equals(employee.getId())){
                e.setPosition(employee.getPosition());
                e.setEmail(employee.getEmail());
                e.setGender(employee.getGender());
                e.setBirthDay(employee.getBirthDay());
                e.setQualifications(employee.getQualifications());
                e.setWage(employee.getWage());
                e.setIdentityCardNumber(employee.getIdentityCardNumber());
                e.setName(employee.getName());
                e.setPhoneNumber(e.getPhoneNumber());
                break;
            }
        }
        FileUtils.writeFile(EMPLOYEE_DATA_PATH,EmployeeCovert.convertEmployeeToString(employees));
    }

    @Override
    public void deleteEmployee(String id) {
        List<Employee> employees=this.getList();
        for(Employee e:employees){
            if(e.getId().equals(id)){
                employees.remove(e);
                break;
            }
        }
        FileUtils.writeFile(EMPLOYEE_DATA_PATH,EmployeeCovert.convertEmployeeToString(employees));
    }

    @Override
    public List<Employee> searchByNameEmployee(String nameEmployee) {
        List<Employee> employees=this.getList();
        List<Employee> list=new ArrayList<>();
        for(Employee e:employees){
            if(e.getName().contains(nameEmployee)){
                list.add(e);
            }
        }
        return list;
    }

    @Override
    public List<Employee> getList() {
        List<Employee> employees= EmployeeCovert.convertStringToEmployee(FileUtils.readFile(EMPLOYEE_DATA_PATH));
        return employees;
    }

    @Override
    public void addNew(Employee employee) {
        List<Employee> employees=this.getList();
        employees.add(employee);
        FileUtils.writeFile(EMPLOYEE_DATA_PATH,EmployeeCovert.convertEmployeeToString(employees));
    }
}
