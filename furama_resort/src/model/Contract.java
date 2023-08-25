package model;

public class Contract {
    private String numberContract;
    private String idBookingContract;
    private int deposit;
    private int totalPay;

    public Contract() {
    }

    public Contract(String numberContract, String idBookingContract, int deposit, int totalPay) {
        this.numberContract = numberContract;
        this.idBookingContract = idBookingContract;
        this.deposit = deposit;
        this.totalPay = totalPay;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public String getIdBookingContract() {
        return idBookingContract;
    }

    public void setIdBookingContract(String idBookingContract) {
        this.idBookingContract = idBookingContract;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
    }

    @Override
    public String toString() {
        return  "numberContract: " + numberContract + "\t" +
                "idBookingContract: " + idBookingContract + "\t"+
                "deposit: " + deposit + "\t" +
                "totalPay: " + totalPay;
    }
}
