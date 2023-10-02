public class Et implements Strategy{
    private Strategy[] strategies;

    public Et(Strategy... strategies) {
        this.strategies = strategies;
    }

    @Override
    public boolean imprimerSi(String s) {
        for (Strategy st : strategies) {
            if(!st.imprimerSi(s)){
                return false;
            }
        }
        return true;
    }
}
