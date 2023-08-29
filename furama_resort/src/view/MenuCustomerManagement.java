package view;

import Utils.Check;
import Utils.Regex;
import controller.person.IControllerCustomer;
import controller.person.impl.ControllerCustomerImpl;
import model.Customer;

import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class MenuCustomerManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IControllerCustomer iControlCustomer = new ControllerCustomerImpl();
    private static final MenuCustomerManagement menuCustomerManagement = new MenuCustomerManagement();
    private static boolean valid = false;
    private static String idCustomer;
    private static String nameCustomer;
    private static String birthDay;
    private static String identityCardNumber;
    private static String phoneNumer;
    private static String email;
    private static String type;
    private static String address;
    private static String gender;

    private static void displayMenuCustomerManagement() {
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
                    List<Customer> list = iControlCustomer.getList();
                    for (Customer l : list) {
                        System.out.println(l);
                    }
                    break;
                case 2:
                    iControlCustomer.addNew(menuCustomerManagement.creatAndUpdateCustomer());
                    break;
                case 3:
                    System.out.println("Nhập id khách hàng cần sửa: ");
                    String idCustomer = scanner.nextLine();
                    Customer customer = menuCustomerManagement.creatAndUpdateCustomer();
                    customer.setId(idCustomer);
                    iControlCustomer.updateCustomer(customer);
                    break;
                case 4:
                    System.out.println("Nhập id khách hàng cần xóa");
                    String id = scanner.nextLine();
                    iControlCustomer.deleteCustomer(id);
                    break;
                case 5:
                    System.out.println("Nhập tên khách hàng cần tìm: ");
                    String name = scanner.nextLine();
                    iControlCustomer.searchByNameCustomer(name);
                    break;
                case 6:
                    FuramaView.render();
                    break;
            }
        } while (option > 0 || option < 7);
    }

    private Customer creatAndUpdateCustomer() {
        Customer customer = new Customer();
        customer.setId(enterId());
        customer.setName(enterName());
        customer.setBirthDay(enterBirthDay());
        customer.setGender(enterGender());
        customer.setIdentityCardNumber(enterIdentityCardNumber());
        customer.setPhoneNumber(enterPhoneNumber());
        customer.setEmail(enterEmail());
        customer.setTypeCustomer(enterType());
        customer.setAddress(enterType());
        return customer;
    }

    private static String enterId() {
        do {
            System.out.println("Nhập mã khách hàng");
            idCustomer = scanner.nextLine();
            valid = Regex.checkIdCustomer(idCustomer);
            valid = !(Check.checkExistCustomer(idCustomer, iControlCustomer.getList()));
            if (!valid) {
                System.out.println("Mã khách hàng đã tồn tại, vui lòng nhập lại");
            }
        } while (!valid);
        return idCustomer;
    }
    private static String enterName(){
        do {
            System.out.println("Nhập tên khách hàng: ");
            nameCustomer = scanner.nextLine();
            valid = Check.checkName(nameCustomer);
        } while (!valid);
        return nameCustomer;
    }
    private static String enterBirthDay(){
        do {
            System.out.println("Nhập ngày sinh: ");
            birthDay = scanner.nextLine();
            try {
                if (Check.validateAge(birthDay)) {
                    valid = true;
                }
            } catch (DateTimeParseException e) {
                valid = false;
                System.out.println("Sai thông tin. Vui lòng nhập lại");
            }
        } while (!valid);
        if (!Check.validateAge(birthDay)){
            System.out.println("Khách hàng không đủ tuổi");
            renderMenuEmployeeManagement();
        }
        return birthDay;
    }
    private static String enterGender(){
        System.out.println("Nhập giới tính: ");
        gender=scanner.nextLine();
        return gender;
    }
    private static String enterIdentityCardNumber(){
        do {
            System.out.println("Nhập số căn cước công dân: ");
            identityCardNumber = scanner.nextLine();
            try {
                if (Regex.checkIdentityCardNumber(identityCardNumber)) {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai thông tin. Vui lòng nhập lại");
            }
        } while (!valid);
        return identityCardNumber;
    }
    private static String enterPhoneNumber(){
        do {
            System.out.println("Nhập số điện thoại: ");
            phoneNumer = scanner.nextLine();
            valid = Regex.checkPhoneNumber(phoneNumer);
        } while (!valid);
        return phoneNumer;
    }
    private static String enterEmail(){
        System.out.println("Nhập email: ");
        email=scanner.nextLine();
        return email;
    }
    private static String enterType(){
        System.out.println("Nhập loại khách hàng: ");
        type=scanner.nextLine();
        return type;
    }
    private static String enterAddress(){
        System.out.println("Nhập địa chỉ: ");
        address=scanner.nextLine();
        return address;
    }
}
