import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CarrotMerchant merchant1 = new CarrotMerchant("Michal", "Brno", LocalDate.of(1982, 11, 23));
        CarrotMerchant merchant2 = new CarrotMerchant("Tomas", "Brno", LocalDate.of(1985, 9,11));
        System.out.println(merchant1);
        System.out.println(merchant2);
    }
}