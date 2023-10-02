public class Compteur implements Strategy {

    private Strategy strategy;
    private int compteur;

    public Compteur(Strategy strategy) {
        this.strategy = strategy;
        compteur = 0;
    }

    public int getCompteur() {
        return compteur;
    }

    @Override
    public boolean imprimerSi(String s) {
        boolean isOk = strategy.imprimerSi(s);
        if (isOk) {
            compteur++;
        }
        return isOk;
    }
}
