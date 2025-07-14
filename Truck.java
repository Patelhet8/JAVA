package Vehicle;

public class Truck extends Vehicle {
    @VehicleInfo("Truck Capacity")
    private int capacity;

    public Truck(String regNumber, String owner, int capacity) {
        super(regNumber, owner);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck - Reg: " + getRegistrationNumber() + ", Owner: " + getOwner() + ", Capacity: " + capacity + " tons");
    }
}
