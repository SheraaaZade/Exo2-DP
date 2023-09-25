import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
         new ListerMots(args[0]).imprimerSi(new CommencePar('t'));
         new ListerMots(args[0]).imprimerSi(new Longueur(5));
         new ListerMots(args[0]).imprimerSi(new Palindrome());
         //lal
        System.out.println("-----------2.2------------------");
        //2.2
        new ListerMots(args[0]).imprimerSi(new And(new CommencePar('t'), new Longueur(5)));
        new ListerMots(args[0]).imprimerSi(new Or(new CommencePar('t'), new Longueur(5)));
        new ListerMots(args[0]).imprimerSi(new Not(new Longueur(5)));

    }
}
