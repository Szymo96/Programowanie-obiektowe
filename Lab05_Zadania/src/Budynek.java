import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    String nazwa;
    int lPieter;

    LocalDate rokBudowy;

    public Budynek(String nazwa, int lPieter, LocalDate rokBudowy) {
        this.nazwa = nazwa;
        this.lPieter = lPieter;
        this.rokBudowy = rokBudowy;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public long getDataBudowy(){
        LocalDate today = LocalDate.now();
        long ileLat = ChronoUnit.YEARS.between(rokBudowy,today);
        return ileLat;
    }

    public void Info(){
        System.out.println("Budynek: "+nazwa+"\tlp. pięter: "+lPieter+
                "\trok budowy: "+rokBudowy+"\twiek budowy: "+getDataBudowy());
    }
}
