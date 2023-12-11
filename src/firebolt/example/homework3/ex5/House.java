package firebolt.example.homework3.ex5;

public class House {
    private String street;
    private int houseNumber;

    public String getStreet() {
        return street;
    }


    public int getHouseNumber() {
        return houseNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public House(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "House{"
               + "street='" + street + '\''
               + ", houseNumber=" + houseNumber
               + '}';
    }
}
