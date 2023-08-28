package view;

import Utils.Regex;
import controller.person.IControllerEmployee;
import controller.person.impl.ControllerEmployeeImpl;
import model.Employee;

import java.util.List;
import java.util.Scanner;

public class MenuEmployeeManagement {
    private static final IControllerEmployee iControllerEmployee=new ControllerEmployeeImpl();
    private static final MenuEmployeeManagement menuEmployeeManagement=new MenuEmployeeManagement();

    private static final Scanner scanner=new Scanner(System.in);
    private static void displayMenuEmployeeManagement(){
        System.out.println("===Menu Employee Management======");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Delete employee");
        System.out.println("5. Search by name employee");
        System.out.println("6. Return main menu");
    }
    public static void renderMenuEmployeeManagement(){

        int option=0;
        do {
            displayMenuEmployeeManagement();
            option=FunctionCheckOption.checkOption();
            switch (option) {
                case 1:
                    List<Employee> list=iControllerEmployee.getList();
                    for(Employee l:list){
                        System.out.println(l);
                    }
                    break;
                case 2:
                    iControllerEmployee.addNew(menuEmployeeManagement.creatAndUpdateEmployee());
                    break;
                case 3:
                    System.out.println("Nhập id nhân viên cần chỉnh sửa:");
                    String idEmployee=scanner.nextLine();
                    Employee employee=menuEmployeeManagement.creatAndUpdateEmployee();
                    employee.setId(idEmployee);
                    iControllerEmployee.updateEmployee(employee);
                    break;
                case 4:
                    System.out.println("Nhập id nhân viên cần xóa: ");
                    String id=scanner.nextLine();
                    iControllerEmployee.deleteEmployee(id);
                    break;
                case 5:
                    System.out.println("Nhập tên nhân viên cần tìm: ");
                    String name=scanner.nextLine();
                    System.out.println(iControllerEmployee.searchByNameEmployee(name));
                    break;
                case 6:
                    FuramaView.render();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (option > 0||option< 7);
    }
    private Employee creatAndUpdateEmployee(){
        Employee employee=new Employee();
        boolean valid=false;
        String name;
        String birthDay;
        do{
            System.out.println("Nhập tên nhân viên: ");
            name=scanner.nextLine();
            valid=Regex.checkIdEmployee(name);
        }while (!valid);
        employee.setName(name);

//        valid=false;
//        do{
//            System.out.println("Nhập ngày sinh: ");
//            employee.setBirthDay(scanner.nextLine());
//            valid.
//        }while (!valid)
//
        System.out.println("Nhập giới tính: ");
        employee.setGender(scanner.nextLine());
        System.out.println("Nhập số căn cước công dân: ");
        employee.setIdentityCardNumber(scanner.nextLine());
        System.out.println("Nhập số điện thoại: ");
        employee.setPhoneNumber(scanner.nextLine());
        System.out.println("Nhập email: ");
        employee.setEmail(scanner.nextLine());
        System.out.println("Nhập bằng cấp: ");
        employee.setQualifications(scanner.nextLine());
        System.out.println("Nhập vị trí: ");
        employee.setPosition(scanner.nextLine());
        System.out.println("Nhập lương: ");
        employee.setWage(scanner.nextLine());
        return employee;
    }
}
