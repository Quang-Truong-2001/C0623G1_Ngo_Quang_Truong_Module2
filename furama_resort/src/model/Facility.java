package model;

public abstract class Facility {
    private String idService;
    private String nameService;
    private double AreaService;
    private double priceService;
    private int numbersOfPeople;
    private String typeService;


    public Facility() {
    }

    public Facility(String idService, String nameService, double areaService, double priceService, int numbersOfPeople, String typeService) {
        this.idService = idService;
        this.nameService = nameService;
        AreaService = areaService;
        this.priceService = priceService;
        this.numbersOfPeople = numbersOfPeople;
        this.typeService = typeService;
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

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    @Override
    public String toString() {
        return  "idService: " + idService + "\t" +
                "nameService: " + nameService + "\t" +
                "AreaService: " + AreaService + "\t" +
                "priceService: " + priceService + "\t" +
                "numbersOfPeople: " + numbersOfPeople + "\t" +
                "typeService: "+ typeService;
    }
}
