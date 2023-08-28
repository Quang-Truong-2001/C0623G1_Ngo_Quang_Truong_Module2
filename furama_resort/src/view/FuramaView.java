package view;

public class FuramaView {
    public static void render(){
        int option=0;
        do{
            showMenu();
            option=FunctionCheckOption.checkOption();
            switch (option) {
                case 1:
                    MenuEmployeeManagement.renderMenuEmployeeManagement();
                    break;
                case 2:
                    MenuCustomerManagement.renderMenuEmployeeManagement();
                    break;
                case 3:
                    MenuFacilityManagement.renderMenuEmployeeManagement();
                    break;
                case 4:
                    MenuBookingManagement.renderMenuEmployeeManagement();
                    break;
                case 5:
                    MenuPromotionManagement.renderMenuEmployeeManagement();
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        }while(option>0||option<7);
    }
    private static void showMenu(){
        System.out.println("========MENU=======");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
    }
}
