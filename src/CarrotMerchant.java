import java.time.LocalDate;

public class CarrotMerchant {
    private String name;
    private LocalDate dateOfBirth;
    private int numOfContracts;
    private double carrotsSoldInTons;
    private String address;
    private String licensePlateNumber;
    private double fuelLitresPerHundredKm;

    public CarrotMerchant(String name, String address, LocalDate date){
        this.name = name;
        this.address = address;
        this.dateOfBirth = date;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ", address: " + this.address + ", date of birth: " + this.dateOfBirth + ".";
    }

}
