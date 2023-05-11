import java.util.HashMap;
import java.time.LocalDate;
import java.time.Year;
public class Calendrier {
    private HashMap<LocalDate,Jour> jours;
    public Calendrier(){
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 31; j++) {
                LocalDate date = LocalDate.of(Year.now().getValue(), i, j);
                Jour jour = new Jour();
                jours.put(date, jour);
            }
        }
    }
}
