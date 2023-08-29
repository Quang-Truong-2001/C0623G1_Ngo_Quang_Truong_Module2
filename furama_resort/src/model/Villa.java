package model;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int numbersOfFloor;

    public Villa() {
    }

    public Villa(String idService, String nameService, double areaService, double priceService, int numbersOfPeople, String typeService, String roomStandard, double poolArea, int numbersOfFloor) {
        super(idService, nameService, areaService, priceService, numbersOfPeople, typeService);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numbersOfFloor = numbersOfFloor;
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
