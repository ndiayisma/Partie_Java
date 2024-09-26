public class Appartement extends BienImmobilier {
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

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    @Override
    public String toString() {
        return "Appartement [etage=" + etage + ", toString()=" + super.toString() + "]";
    }
    
}
