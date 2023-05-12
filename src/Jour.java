import java.util.LinkedList;
public class Jour {
    LinkedList<Créno> listeCréno;
    public Jour(){
        listeCréno = new LinkedList<Créno>();
    }
    public boolean insererCréno(Créno newCréno){
        if (this.vérifierDisponibilitéeCréno(newCréno)){
            listeCréno.add(newCréno);
            return true;
        }else {
            System.out.println("Ak dekhltou f w7d kyn deja g3artha !!");
            return false;
        }
    }
    private boolean vérifierDisponibilitéeCréno(Créno nouveaCréno){
        for (Créno créno : listeCréno) {
            if((nouveaCréno.getHeureDebut().isAfter(créno.getHeureDebut())) && (nouveaCréno.getHeureDebut().isBefore(créno.getHeureFin()))){
                System.out.println("Vous ete entrain d'inserer dans créno qui existe deja !!! ");
                return false;
            } else if ((nouveaCréno.getHeureFin().isAfter(créno.getHeureDebut())) && (nouveaCréno.getHeureFin().isBefore(créno.getHeureFin()))) {
                System.out.println("Well m3a lwl ak s7i7 mais mzl dekhlou f w7d");
                return false;
            }
        }
        return true;
    }
}
