package case_study.model;

public abstract class Furama {
    private String id;
    private String nameService;
    private double Area;
    private double price;
    private int amount;
    private String type;
    private int year;
    private int month;
    private int day;
    private String hour;

    public Furama() {
    }

    public Furama(String id, String nameService, double area, double price, int amount, String type, int year, int month, int day, String hour) {
        this.id = id;
        this.nameService = nameService;
        Area = area;
        this.price = price;
        this.amount = amount;
        this.type = type;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Furama{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", Area=" + Area +
                ", price=" + price +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", hour='" + hour + '\'' +
                '}';
    }
}
