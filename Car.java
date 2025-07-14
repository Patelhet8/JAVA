package Vehicle;

public class Car extends Vehicle {
    @VehicleInfo("Car Model")
    private String model;

    public Car(String regNumber, String owner, String model) {
        super(regNumber, owner);
        this.model = model;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - Reg: " + getRegistrationNumber() + ", Owner: " + getOwner() + ", Model: " + model);
    }
}
