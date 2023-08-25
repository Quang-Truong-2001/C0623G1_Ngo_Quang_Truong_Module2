package model;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int numbersOfFloor;

    public Villa() {
    }

    public Villa(String idService, String nameService, double areaService, double priceService, int numbersOfPeople, String typeServiceYear, String typeServiceMonth, String typeServiceDay, String typeServiceHour, String roomStandard, double poolArea, int amountFloor) {
        super(idService, nameService, areaService, priceService, numbersOfPeople, typeServiceYear, typeServiceMonth, typeServiceDay, typeServiceHour);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numbersOfFloor = amountFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumbersOfFloor() {
        return numbersOfFloor;
    }

    public void setNumbersOfFloor(int numbersOfFloor) {
        this.numbersOfFloor = numbersOfFloor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "roomStandard: " + roomStandard + "\t" +
                "poolArea: " + poolArea + "\t" +
                "numbersOfFloor: " + numbersOfFloor;
    }

}
