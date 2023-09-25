public class Not implements Strategy {
    private Strategy strategy;

    public Not(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean imprimerSi(String s) {
        return !strategy.imprimerSi(s);
    }
}
