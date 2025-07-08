package vehicle;
public class Vehicle {
    private String registrationNumber;
    private int registrationYear;
    private String ownerName;
    private int validity;
    private String engineNumber;

    public Vehicle() {
        registrationNumber = "NIL";
        registrationYear = 0;
        ownerName = "NIL";
        validity = 0;
        engineNumber = "NIL";
    }

    public Vehicle(String rNumber, int rYear, String oName, int vali, String eNumber) {
        registrationNumber = rNumber;
        registrationYear = rYear;
        ownerName = oName;
        validity = vali;
        engineNumber = eNumber;
    }

    public String getRegistrationNumber(){ 
        return registrationNumber;
         }
    public void setRegistrationNumber(String registrationNumber)
     { 
        this.registrationNumber = registrationNumber; 
        }
    public int getRegistrationYear() { 
        return registrationYear;
         }
    public void setRegistrationYear(int registrationYear) {
         this.registrationYear = registrationYear;
          }
    public String getOwnerName() { 
        return ownerName;
         }
    public void setOwnerName(String ownerName) { 
        this.ownerName = ownerName; 
        }
    public int getValidity() {
         return validity;
          }
    public void setValidity(int validity) { 
        this.validity = validity;
         }
    public String getEngineNumber() { 
        return engineNumber;
         }
    public void setEngineNumber(String engineNumber) {
         this.engineNumber = engineNumber;
          }
}