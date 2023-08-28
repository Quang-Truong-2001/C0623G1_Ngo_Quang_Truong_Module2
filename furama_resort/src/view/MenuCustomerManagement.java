package view;

import controller.person.IControllerCustomer;
import controller.person.impl.ControllerCustomerImpl;
import model.Customer;
import model.Employee;

import java.util.List;
import java.util.Scanner;

public class MenuCustomerManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IControllerCustomer iControlCustomer=new ControllerCustomerImpl();
    private static final MenuCustomerManagement menuCustomerManagement=new MenuCustomerManagement();
    private static void displayMenuCustomerManagement(){
        System.out.println("===Menu Customer Management======");
        System.out.println("1. Display list Customer");
        System.out.println("2. Add new Customer");
        System.out.println("3. Edit Customer");
        System.out.println("4. Delete Customer");
        System.out.println("5. Search by name Customer");
        System.out.println("6. Return main menu");
    }
    public static void renderMenuEmployeeManagement() {
        int option = 0;
        do {
            displayMenuCustomerManagement();
            option = FunctionCheckOption.checkOption();
            switch (option) {
                case 1:
                    List<Customer> list=iControlCustomer.getList();
                    for(Customer l:list){
                        System.out.println(l);
                    }
                    break;
                case 2:
                    iControlCustomer.addNew(menuCustomerManagement.creatAndUpdateCustomer());
                    break;
                case 3:
                    System.out.println("Nhập id khách hàng cần sửa: ");
                    String idCustomer=scanner.nextLine();
                    Customer customer=menuCustomerManagement.creatAndUpdateCustomer();
                    customer.setId(idCustomer);
                    iControlCustomer.updateCustomer(customer);
                    break;
                case 4:
                    System.out.println("Nhập id khách hàng cần xóa");
                    String id=scanner.nextLine();
                    iControlCustomer.deleteCustomer(id);
                    break;
                case 5:
                    System.out.println("Nhập tên khách hàng cần tìm: ");
                    String name=scanner.nextLine();
                    iControlCustomer.searchByNameCustomer(name);
                    break;
                case 6:
                    FuramaView.render();
                    break;
            }
        } while (option > 0 || option < 7);
    }
    private Customer creatAndUpdateCustomer(){
        Customer customer=new Customer();
        System.out.println("Nhập tên khách hàng: ");
        customer.setName(scanner.nextLine());
        System.out.println("Nhập ngày sinh: ");
        customer.setBirthDay(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        customer.setGender(scanner.nextLine());
        System.out.println("Nhập số căn cước công dân: ");
        customer.setIdentityCardNumber(scanner.nextLine());
        System.out.println("Nhập số điện thoại: ");
        customer.setPhoneNumber(scanner.nextLine());
        System.out.println("Nhập email: ");
        customer.setEmail(scanner.nextLine());
        System.out.println("Nhập loại khách hàng: ");
        customer.setTypeCustomer(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        customer.setAddress(scanner.nextLine());
        return customer;
    }
}
