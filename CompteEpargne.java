public class CompteEpargne extends Compte{

    public static int nbComptesE = 0;
    public static double taux = 6;
    
    public CompteEpargne(Client leProproetaire, Agence agence){
        super(leProproetaire, agence);
        String code = this.getClass().getName()+":"+ ++nbComptesE;
        setCode(code);
    }

    public CompteEpargne(double leSolde, Client leProproetaire, Agence agence){
        super(leSolde, leProproetaire, agence);
        String code = this.getClass().getName()+":"+ ++nbComptesE;
        setCode(code);
    }

    public void calculInteret(){solde = solde * (1+taux/100);}
    public double getTaux() {return taux;}
    public static void setTaux(double newTaux) {taux = newTaux;}

    public String toString() {
        String s = 
        "\t| "+getCode()+" | Solde: "+solde+" DH | Taux: "+taux + " |" +
        "\n\t-----------------------------------------------------------------------" ;
        return s;
    }
}
