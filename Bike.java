package Vehicle;

public class Bike extends Vehicle {
    @VehicleInfo("Bike Type")
    private String type;

    public Bike(String regNumber, String owner, String type) {
        super(regNumber, owner);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike - Reg: " + getRegistrationNumber() + ", Owner: " + getOwner() + ", Type: " + type);
    }
}
