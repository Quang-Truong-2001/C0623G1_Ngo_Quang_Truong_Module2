package view;

import Utils.Check;
import Utils.Regex;
import controller.person.ControllerEmployee;
import model.Employee;

import java.util.List;
import java.util.Scanner;

public class MenuEmployeeManagement {
    private static final ControllerEmployee iControllerEmployee=new ControllerEmployee();
    private static final MenuEmployeeManagement menuEmployeeManagement=new MenuEmployeeManagement();
    private static boolean valid=false;

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
                    System.out.println("Danh sách nhân viên");
                    List<Employee> list=iControllerEmployee.getList();
                    for(Employee l:list){
                        System.out.println(l);
                    }
                    break;
                case 2:
                    iControllerEmployee.addNew(menuEmployeeManagement.creatAndUpdateEmployee());
                    System.out.println("Thêm nhân viên thành công");
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

        employee.setId(enterIdEmployee());
        employee.setName(enterName());
        employee.setBirthDay(enterBirthDay());
        employee.setGender(enterGender());
        employee.setIdentityCardNumber(enterIdentityCardNumber());
        employee.setPhoneNumber(enterPhoneNumber());
        employee.setEmail(enterEmail());
        employee.setQualifications(enterQualification());
        employee.setPosition(enterPosition());
        employee.setWage(enterWage());

        return employee;
    }
    private static String enterIdEmployee(){
        String idEmployee;
        do{
            System.out.println("Nhập mã nhân viên: ");
            idEmployee=scanner.nextLine();
            valid=Regex.checkIdEmployee(idEmployee);
            valid=!(Check.checkExistEmployee(idEmployee, iControllerEmployee.getList()));
            if(!valid){
                System.out.println("Mã nhân viên đã tồn tại, vui lòng nhập lại");
            }
        }while (!valid);
        return idEmployee;
    }
    private static String enterName(){
        String name;
        do{
            System.out.println("Nhập tên nhân viên: ");
            name=scanner.nextLine();
            valid= Check.checkName(name);
        }while (!valid);
        return name;
    }
    private static String enterBirthDay(){
        String birthDay;
        do{
            System.out.println("Nhập ngày sinh: ");
            birthDay=scanner.nextLine();
            valid=Regex.checkBirthDay(birthDay);
        }while (!valid);
        return birthDay;
    }
    private static String enterGender(){
        String gender;
        do{
            System.out.println("Nhập giới tính: ");
            gender=scanner.nextLine();
            valid=Check.checkGender(gender);
        } while(!valid);
        return gender;
    }
    private static String enterIdentityCardNumber(){
        String identityCardNumber;
        do{
            System.out.println("Nhập số căn cước công dân: ");
            identityCardNumber =scanner.nextLine();
            valid=Regex.checkIdentityCardNumber(identityCardNumber);
        }while (!valid);
        return identityCardNumber;
    }
    private static String enterPhoneNumber(){
        String phoneNumber;
        do{
            System.out.println("Nhập số điện thoại: ");
            phoneNumber=scanner.nextLine();
            valid=Regex.checkPhoneNumber(phoneNumber);
        }while (!valid);
        return phoneNumber;
    }
    private static String enterEmail(){
        String email;
        do{
            System.out.println("Nhập email: ");
            email=scanner.nextLine();
            valid=Regex.checkEmail(email);
        }while(!valid);
        return email;
    }
    private static String enterQualification(){
        String qualifications;
        System.out.println("Nhập bằng cấp: ");
        qualifications=scanner.nextLine();
        return qualifications;
    }
    private static String enterPosition(){
        String position;
        System.out.println("Nhập vị trí: ");
        position=scanner.nextLine();
        return position;
    }
    private static String enterWage(){
        String wage;
        do{
            System.out.println("Nhập lương: ");
            wage=scanner.nextLine();
        }while (Double.parseDouble(wage)<=0);
        return wage;
    }
}
