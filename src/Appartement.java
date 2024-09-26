public class Appartement extends BienImmobillier {
    private String etage;
    private boolean ascenseur;

    public Appartement(String adresse, String ville, String codePostal, Vendeur vendeur, String etage) {
        super(adresse, ville, codePostal, vendeur);
        this.etage = etage;
    }

    public Appartement(String adresse, String ville, String codePostal, Vendeur vendeur, String etage, boolean ascenseur) {
        super(adresse, ville, codePostal, vendeur);
        this.etage = etage;
        this.ascenseur = false;
    }

    public String typeBien() {
        
        String bien = " T";
        return bien;
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    @Override
    public String toString() {
        String resultat = "";
        resultat = "Appartement de type" + typeBien();
        if(ascenseur){
            resultat += " avec ascenseur ";
        } resultat += "situé au " + etage + " ";
        resultat += super.toString();
        return resultat;
    }
    
}
