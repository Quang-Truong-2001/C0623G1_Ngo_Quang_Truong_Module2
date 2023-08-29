package model;

public class House extends Facility{
    private String roomStandard;
    private int numbersOfFloor;

    public House() {
    }

    public House(String idService, String nameService, double areaService, double priceService, int numbersOfPeople, String typeService, String roomStandard, int numbersOfFloor) {
        super(idService, nameService, areaService, priceService, numbersOfPeople, typeService);
        this.roomStandard = roomStandard;
        this.numbersOfFloor = numbersOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumbersOfFloor() {
        return numbersOfFloor;
    }

    public void setNumbersOfFloor(int numbersOfFloor) {
        this.numbersOfFloor = numbersOfFloor;
    }

    @Override
    public String toString() {
        return super.toString()+
                "roomStandard: " + roomStandard + "\t" +
                "numbersOfFloor: " + numbersOfFloor;
    }
}
