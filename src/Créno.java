import java.time.Duration;
import java.time.LocalTime;
public class Créno implements Décomposable{
    private LocalTime HeureDebut;
    private LocalTime HeureFin;
    private EtatCréno état;
    private Tache tache;

    public Créno(LocalTime HeureDebut,LocalTime HeureFin,EtatCréno état){
        this.HeureDebut = HeureDebut;
        this.HeureFin = HeureFin;
        this.état = état;
    }


    public LocalTime getHeureDebut() {
        return HeureDebut;
    }

    public LocalTime getHeureFin() {
        return HeureFin;
    }
}
