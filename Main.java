package Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("CAR123", "Het", "Sedan");
        Vehicle bike = new Bike("BIK456", "Aryan", "Sport");
        Vehicle truck = new Truck("TRK789", "Krish", 10);

        car.displayInfo();
        bike.displayInfo();
        truck.displayInfo();
    }
}
