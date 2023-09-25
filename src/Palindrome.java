public class Palindrome implements Strategy {
    @Override
    public boolean imprimerSi(String s) {
        if (s == null)
            return false;
        StringBuffer stringbuffer = new StringBuffer(s);
        return s.equals(stringbuffer.reverse().toString());
    }
}
