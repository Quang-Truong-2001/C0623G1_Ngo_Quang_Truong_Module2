package model;

public class Booking {
    private String idBooking;
    private int dayBooking;
    private int dayStart;
    private int dayEnd;
    private String idCustomer;
    private String idService;

    public Booking() {
    }

    public Booking(String idBooking, int dayBooking, int dayStart, int dayEnd, String idCustomer, String idService) {
        this.idBooking = idBooking;
        this.dayBooking = dayBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public int getDayBooking() {
        return dayBooking;
    }

    public void setDayBooking(int dayBooking) {
        this.dayBooking = dayBooking;
    }

    public int getDayStart() {
        return dayStart;
    }

    public void setDayStart(int dayStart) {
        this.dayStart = dayStart;
    }

    public int getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(int dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return  "idBooking: " + idBooking + "\t" +
                "dayBooking: " + dayBooking + "\t" +
                "dayStart: " + dayStart +"\t" +
                "dayEnd: " + dayEnd +"\t" +
                "idCustomer: '" + idCustomer + "\t" +
                "idService: " + idService + "\t";
    }
}
