public class Utilisateur {
    //Infos User
    private String nom;
    private String prénom;
    private String userName;
    private String passWord;
    //Calendrier
    Calendrier calendrier;
    //Sauvgarde Planning


    public Utilisateur(String nom,String prénom,String userName,String passWord,Calendrier calendrier) {
        this.nom = nom;
        this.passWord = passWord;
        this.userName = userName;
        this.prénom = prénom;
        this.calendrier = new Calendrier();
    }
}
