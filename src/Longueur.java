public class Longueur implements Strategy{

    private int longueur;

    public Longueur(int longueur) {
        this.longueur = longueur;
    }

    @Override
    public boolean imprimerSi(String s) {
        return s.length() == longueur;
    }
}
