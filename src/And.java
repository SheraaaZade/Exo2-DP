public class And implements Strategy{
    private Strategy strategy1;
    private Strategy strategy2;

    public And(Strategy strategy1, Strategy strategy2) {
        this.strategy1 = strategy1;
        this.strategy2 = strategy2;
    }


    @Override
    public boolean imprimerSi(String s) {
        return strategy1.imprimerSi(s) && strategy2.imprimerSi(s);
    }
}
