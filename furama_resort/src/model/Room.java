package model;

public class Room extends Facility{
    private String voucher;

    public Room() {
    }

    public Room(String idService, String nameService, double areaService, double priceService, int numbersOfPeople, String typeService, String voucher) {
        super(idService, nameService, areaService, priceService, numbersOfPeople, typeService);
        this.voucher = voucher;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return super.toString() +
                "voucher: " + voucher + "\t";
    }
}
