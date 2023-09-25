public class CommencePar implements Strategy {
    private char o;

    public CommencePar(char a) {
        this.o = a;
    }

    @Override
    public boolean imprimerSi(String s) {
        return s.charAt(0) == o;
    }
}
