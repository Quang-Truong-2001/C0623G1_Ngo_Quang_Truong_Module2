package view;

import Utils.Check;
import Utils.Regex;
import controller.facility.FacilityController;
import model.Facility;
import model.House;
import model.Room;
import model.Villa;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MenuFacilityManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static final FacilityController facilityControl=new FacilityController();
    private static boolean valid=false;




    private static void displayMenuFacilityManagement(){
        System.out.println("===Menu Facility Management======");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Delete facility");
        System.out.println("5. Return main menu");
    }
    public static void renderMenuFacilityManagement() {
        int option = 0;
        do {
            displayMenuFacilityManagement();
            option = FunctionCheckOption.checkOption();
            switch (option) {
                case 1:
                    System.out.println("========Danh sách=============");
                    Map<Facility, Integer> map=facilityControl.getList();
                    for(Map.Entry<Facility, Integer> entry: map.entrySet()){
                        System.out.println(entry.getKey()+"      "+entry.getValue());
                    }
                    renderMenuFacilityManagement();
                    break;
                case 2:
                    int select;
                    do{
                        System.out.println("1. Add New Villa");
                        System.out.println("2. Add New House");
                        System.out.println("3. Add New Room");
                        System.out.println("4. Back to menu");
                        System.out.println("Nhập chức năng");
                        select=Integer.parseInt(scanner.nextLine());
                        switch (select){
                            case 1:
                                facilityControl.addNew(addNewVilla(),0);
                                System.out.println("Thêm villa thành công");
                                break;
                            case 2:
                                facilityControl.addNew(addNewHouse(),0);
                                System.out.println("Thêm house thành công");
                                break;
                            case 3:
                                facilityControl.addNew(addNewRoom(),0);
                                System.out.println("Thêm Room thành công");
                                break;
                            case 4:
                                renderMenuFacilityManagement();
                                break;
                        }
                    } while(select>0||select<5);
                    break;
                case 3:
                    System.out.println("======Danh sách cần bảo trì======");
                    List<Facility> list=facilityControl.displayListFacilityMaintenance();
                    for(Facility l:list){
                        System.out.println(l);
                    }
                    break;
                case 4:
                    System.out.println("Nhập mã dịch vụ cần xóa:");
                    String idService=scanner.nextLine();
                    facilityControl.deleteFacility(idService);
                    break;
                case 5:
                    FuramaView.render();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (option > 0 || option <6);
    }
    private static Villa addNewVilla(){
        Villa villa=new Villa();
        villa.setIdService(enterIdService("VILLA"));
        villa.setNameService(enterNameService());
        villa.setAreaService(enterAreaService());
        villa.setPriceService(enterPriceService());
        villa.setNumbersOfPeople(enterNumbersOfPeople());
        villa.setTypeService(enterTypeService());
        villa.setRoomStandard(enterRoomStandard());
        villa.setPoolArea(enterPoolArea());
        villa.setNumbersOfFloor(enterNumbersOfFloor());
        return villa;
    }
    private static House addNewHouse(){
        House house=new House();
        house.setIdService(enterIdService("HOUSE"));
        house.setNameService(enterNameService());
        house.setAreaService(enterAreaService());
        house.setPriceService(enterPriceService());
        house.setNumbersOfPeople(enterNumbersOfPeople());
        house.setTypeService(enterTypeService());
        house.setRoomStandard(enterRoomStandard());
        house.setNumbersOfFloor(enterNumbersOfFloor());
        return house;
    }
    private static Room addNewRoom(){
        Room room=new Room();
        room.setIdService(enterIdService("ROOM"));
        room.setNameService(enterNameService());
        room.setAreaService(enterAreaService());
        room.setPriceService(enterPriceService());
        room.setNumbersOfPeople(enterNumbersOfPeople());
        room.setTypeService(enterTypeService());
        room.setVoucher(enterVoucher());
        return room;
    }
    private static String enterIdService(String type){
        String idService;
        do{
            System.out.println("Nhập mã dịch vụ");
            idService=scanner.nextLine();
            switch (type){
                case "VILLA":
                    valid = Regex.checkIdServiceVilla(idService);
                    break;
                case "ROOM":
                    valid=Regex.checkIdServiceRoom(idService);
                    break;
                case "HOUSE":
                    valid=Regex.checkIdServiceHouse(idService);
                    break;
            }
        } while (!valid);
        return idService;
    }
    private static String enterNameService(){
        String nameService = null;
        do{
            try {
                System.out.println("Nhập tên dịch vụ: ");
                nameService=scanner.nextLine();
                valid=Check.checkName(nameService);
            } catch (Exception e){
                System.out.println("Thông tin sai. Vui lòng nhập lại: ");
                valid=false;
            }
        } while (!valid);
        return nameService;
    }
    private static double enterAreaService(){
        double areaService = 0;
        do{
            try {
                System.out.println("Nhập diện tích dịch vụ");
                areaService=Double.parseDouble(scanner.nextLine());
                valid=Check.checkArea(areaService);
            } catch (Exception e){
                System.out.println("Thông tin sai. Vui lòng nhập lại: ");
                valid=false;
            }
        } while (!valid);
        return areaService;
    }
    private static double enterPriceService(){
        double priceService = 0;
        do{
            try {
                System.out.println("Nhập giá dịch vụ");
                priceService=Double.parseDouble(scanner.nextLine());
                valid=Check.checkPriceService(priceService);
            } catch (Exception e){
                System.out.println("Thông tin sai. Vui lòng nhập lại: ");
                valid=false;
            }
        } while (!valid);
        return priceService;
    }
    private static int enterNumbersOfPeople(){
        int numbersOfPeople = 0;
        do{
            try {
                System.out.println("Nhập số người");
                numbersOfPeople=Integer.parseInt(scanner.nextLine());
                valid=Check.checkNumbersOfPeople(numbersOfPeople);
                if(numbersOfPeople>19){
                    System.out.println("Số lượng người phải dưới 20");
                    valid=false;
                }
            } catch (Exception e){
                System.out.println("Thông tin sai. Vui lòng nhập lại: ");
                valid=false;
            }
        } while(!valid);
        return numbersOfPeople;
    }
    private static String enterTypeService(){
        String typeService = null;
        do{
            try {
                System.out.println("Nhập loại dịch vụ");
                typeService = scanner.nextLine();
                valid=Check.checkTypeService(typeService);
            } catch (Exception e){
                System.out.println("Thông tin sai. Vui lòng nhập lại: ");
                valid=false;
            }
        } while(!valid);
        return typeService;
    }
    private static String enterRoomStandard(){
        String roomStandard = null;
        do{
            try {
                System.out.println("Nhập tiêu chuẩn phòng");
                roomStandard = scanner.nextLine();
            } catch (Exception e){
                System.out.println("Thông tin sai. Vui lòng nhập lại: ");
                valid=false;
            }
        } while(!valid);
        return roomStandard;
    }
    private static int enterPoolArea(){
        int poolArea = 0;
        do{
            try {
                System.out.println("Nhập diện tích hồ bơi");
                poolArea=Integer.parseInt(scanner.nextLine());
                valid=Check.checkPoolArea(poolArea);
            } catch (Exception e){
                System.out.println("Thông tin sai. Vui lòng nhập lại: ");
                valid=false;
            }
        } while(!valid);
        return poolArea;
    }
    private static int enterNumbersOfFloor(){
        int numbersOfFloor = 0;
        do{
            try {
                System.out.println("Nhập số tầng");
                numbersOfFloor=Integer.parseInt(scanner.nextLine());
                valid=Check.checkNumbersOfFloor(numbersOfFloor);
            } catch (Exception e){
                System.out.println("Thông tin sai. Vui lòng nhập lại: ");
                valid=false;
            }
        } while(!valid);
        return numbersOfFloor;
    }
    private static String enterVoucher(){
        String voucher = null;
        do{
            try {
                System.out.println("Nhập voucher");
                voucher=scanner.nextLine();
            } catch (Exception e){
                System.out.println("Thông tin sai. Vui lòng nhập lại: ");
                valid=false;
            }
        } while(!valid);
        return voucher;
    }
    
}
