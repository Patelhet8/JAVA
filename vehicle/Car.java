package vehicle;
public class Car extends Vehicle {
    private String companyName;
    private String modelName;
    private final String carColour = "White";

    public void setCompany(String companyName) {
        this.companyName = companyName;
    }
    public String getCompany() {
        return companyName;
    }

    public void setModel(String modelName) {
        this.modelName = modelName;
    }
    public String getModel() {
        return modelName;
    }
    public void printCompany() {
        System.out.println("Company name: " + companyName);
    }
    public void printModel() {
        System.out.println("Model name: " + modelName);
    }
    public void printCarColor(){
        System.out.println(carColour);
    }
}