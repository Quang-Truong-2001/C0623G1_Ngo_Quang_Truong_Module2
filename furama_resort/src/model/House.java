package model;

public class House extends Facility{
    private String roomStandard;
    private String numbersOfFloor;

    public House() {
    }

    public House(String idService, String nameService, double areaService, double priceService, int numbersOfPeople, String typeServiceYear, String typeServiceMonth, String typeServiceDay, String typeServiceHour, String roomStandard, String numbersOfFloor) {
        super(idService, nameService, areaService, priceService, numbersOfPeople, typeServiceYear, typeServiceMonth, typeServiceDay, typeServiceHour);
        this.roomStandard = roomStandard;
        this.numbersOfFloor = numbersOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumbersOfFloor() {
        return numbersOfFloor;
    }

    public void setNumbersOfFloor(String numbersOfFloor) {
        this.numbersOfFloor = numbersOfFloor;
    }

    @Override
    public String toString() {
        return super.toString()+
                "roomStandard: " + roomStandard + "\t" +
                "numbersOfFloor: " + numbersOfFloor;
    }
}
