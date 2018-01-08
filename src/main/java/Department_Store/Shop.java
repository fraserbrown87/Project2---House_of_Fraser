package Department_Store;

public class Shop {

    private String name;
    private String address;
    private int phoneNumber;
    private int floorQuantity;
    private OpeningHours openingDay;

    public Shop(String name, String address, int phoneNumber, int floorQuantity, OpeningHours openingDay){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.floorQuantity = floorQuantity;
        this.openingDay = openingDay;
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getFloorQuantity() {
        return floorQuantity;
    }

    public OpeningHours getOpeningDay() {
        return openingDay;
    }
}