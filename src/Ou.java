public class Ou implements Strategy{

    private Strategy[] strategies;

    public Ou(Strategy... strategies) {
        this.strategies = strategies;
    }


    @Override
    public boolean imprimerSi(String s) {
        for (Strategy st : strategies) {
            if(st.imprimerSi(s)){
                return true;
            }
        }
        return false;
    }
}
