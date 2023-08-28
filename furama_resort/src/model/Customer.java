package model;

public class Customer extends Person{
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, String birthDay, String gender, String identityCardNumber, String phoneNumber, String email, String typeCustomer, String address) {
        super(id, name, birthDay, gender, identityCardNumber, phoneNumber, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                "typeCustomer: " + typeCustomer + "\t" +
                "address: " + address;
    }
}
