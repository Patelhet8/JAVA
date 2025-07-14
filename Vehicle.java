package Vehicle;

public abstract class Vehicle {
    @VehicleInfo("Registration Number")
    private final String registrationNumber;

    @VehicleInfo("Owner Name")
    private String owner;

    public Vehicle(String registrationNumber, String owner) {
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    public final String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public abstract void displayInfo();
}
