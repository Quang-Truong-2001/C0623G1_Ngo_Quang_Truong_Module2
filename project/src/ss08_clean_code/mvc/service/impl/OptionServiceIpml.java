package ss08_clean_code.mvc.service.impl;

import ss08_clean_code.mvc.service.IOptionService;

public class OptionServiceIpml implements IOptionService {
    @Override
    public void selectService(int select) throws Exception{
        switch(select){
            case 1:
                System.out.println("Bạn đã chọn đối tượng là giáo viên");
                break;
            case 2:
                System.out.println("Bạn đã chọn đối tượng là học sinh");
                break;
            default:
                throw new Exception("Bạn chọn không đúng đối tượng");
        }
    }


    @Override
    public void optionService(int option) throws Exception {
        switch(option){
            case 1:
                System.out.println("Bạn chọn chức năng thêm");
                break;
            case 2:
                System.out.println("Bạn chọn chức năng xóa");
                break;
            case 3:
                System.out.println("Bạn chọn chức năng xem danh sách");
                break;
            case 4:
                System.out.println("Bạn chọn chức năng Thoát");
                break;
            default:
                throw new Exception("Bạn chọn không đúng");

        }
    }


}
