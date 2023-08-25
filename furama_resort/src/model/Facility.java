package model;

public abstract class Facility {
    private String idService;
    private String nameService;
    private double AreaService;
    private double priceService;
    private int numbersOfPeople;
    private String typeServiceYear;
    private String typeServiceMonth;
    private String typeServiceDay;
    private String typeServiceHour;


    public Facility() {
    }

    public Facility(String idService, String nameService, double areaService, double priceService, int numbersOfPeople, String typeServiceYear, String typeServiceMonth, String typeServiceDay, String typeServiceHour) {
        this.idService = idService;
        this.nameService = nameService;
        this.AreaService = areaService;
        this.priceService = priceService;
        this.numbersOfPeople = numbersOfPeople;
        this.typeServiceYear = typeServiceYear;
        this.typeServiceMonth = typeServiceMonth;
        this.typeServiceDay = typeServiceDay;
        this.typeServiceHour = typeServiceHour;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaService() {
        return AreaService;
    }

    public void setAreaService(double areaService) {
        this.AreaService = areaService;
    }

    public double getPriceService() {
        return priceService;
    }

    public void setPriceService(double priceService) {
        this.priceService = priceService;
    }

    public int getNumbersOfPeople() {
        return numbersOfPeople;
    }

    public void setNumbersOfPeople(int numbersOfPeople) {
        this.numbersOfPeople = numbersOfPeople;
    }

    public String getTypeServiceYear() {
        return typeServiceYear;
    }

    public void setTypeServiceYear(String typeServiceYear) {
        this.typeServiceYear = typeServiceYear;
    }

    public String getTypeServiceMonth() {
        return typeServiceMonth;
    }

    public void setTypeServiceMonth(String typeServiceMonth) {
        this.typeServiceMonth = typeServiceMonth;
    }

    public String getTypeServiceDay() {
        return typeServiceDay;
    }

    public void setTypeServiceDay(String typeServiceDay) {
        this.typeServiceDay = typeServiceDay;
    }

    public String getTypeServiceHour() {
        return typeServiceHour;
    }

    public void setTypeServiceHour(String typeServiceHour) {
        this.typeServiceHour = typeServiceHour;
    }

    @Override
    public String toString() {
        return  "idService: " + idService + "\t" +
                "nameService: " + nameService + "\t" +
                "AreaService: " + AreaService + "\t" +
                "priceService: " + priceService + "\t" +
                "numbersOfPeople: " + numbersOfPeople + "\t" +
                "typeServiceYear: " + typeServiceYear + "\t" +
                "typeServiceMonth: " + typeServiceMonth + "\t" +
                "typeServiceDay: " + typeServiceDay + "\t" +
                "typeServiceHour: " + typeServiceHour + "\t";
    }
}
