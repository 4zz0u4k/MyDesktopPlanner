import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Utilisateur {
    //Infos User
    private String nom;
    private String prénom;
    private String userName;
    private String passWord;
    //Calendrier
    Calendrier calendrier;
    //Sauvgarde Planning


    public Utilisateur(String nom,String prénom,String userName,String passWord) {
        this.nom = nom;
        this.passWord = passWord;
        this.userName = userName;
        this.prénom = prénom;
        this.calendrier = new Calendrier();
    }

    public void initialisationCrénoLibre(){
        Scanner scanner = new Scanner(System.in);
        boolean inserer;
        System.out.println("Voulez vous inserer des crénos libre ?");
        String nouvelleInsertion = scanner.nextLine();
        if(nouvelleInsertion.compareTo("Yes") == 0){
            Créno nouveauCrénoLibre;
            inserer = true;
            String dateInserton;
            String heureDébut;
            String heureFin;
            while (inserer){
                System.out.println("Entrer la date : (Veuillez respecter le fomat YYYY-MM-DD)");
                dateInserton = scanner.nextLine();
                System.out.println("Entrer l'heure de debut : (Veuillez respecter le fomat HH-MM-SS)");
                heureDébut = scanner.nextLine();
                System.out.println("Entrer l'heure de Fin :  (Veuillez respecter le fomat HH-MM-SS)");
                heureFin = scanner.nextLine();
                if(vérifierValiditéDateHeure(heureDébut,heureFin,dateInserton)){
                    nouveauCrénoLibre = new Créno(LocalTime.parse(heureDébut),LocalTime.parse(heureFin),EtatCréno.Libre);
                    calendrier.insertCreno(LocalDate.parse(dateInserton),nouveauCrénoLibre);
                }else{
                    System.out.println(""); //A traiter ... ( ghlate fles infos lzm yetverifyaw shkn ghlate fihom w djih possiblité y3awd wesh ghlate brk )
                }
                System.out.println("Inserer un nouveau creno libre ? ");
                nouvelleInsertion = scanner.nextLine();
                if (nouvelleInsertion.compareTo("Yes") != 0){
                    inserer = false;
                    System.out.println("OK !!");
                }
                System.out.println("+---------------------------------+");
            }
        }
        else {
            System.out.println("OK !");
        }
    }

    public boolean vérifierValiditéDateHeure(String heureDébut,String heureFin,String date){
        try {
            LocalTime.parse(date);
        } catch (DateTimeParseException e) {
            System.out.println("you didn't respect the giving date format :((  YYYY-MM-DD");
            return false;
        }
        try {
            LocalTime.parse(heureDébut);
        } catch (DateTimeParseException e) {
            System.out.println("you didn't respect the giving Time format :((  HH-MM-SS");
            return false;
        }
        try {
            LocalTime.parse(heureFin);
            System.out.println("you didn't respect the giving Time format :((  HH-MM-SS");
        } catch (DateTimeParseException e) {
            return false;
        }
        if(LocalTime.parse(heureDébut).isAfter(LocalTime.parse(heureFin))) {
            System.out.println("WTF ?? , heure Debut after heure fin ??");
            return false;
        }
        return true;
    }
}
