public class NormaleOndernemer extends Eindafrekening {

    public NormaleOndernemer (double eindbedragExclusiefBTW) {
        super (eindbedragExclusiefBTW);
    }

    public String getTotaalOfSubtotaal () {
        return "Subtotaal";
    }

    public String toString () {

        double exBTW = getEindbedragExclusiefBTW ();

        return String.format ("21%% BTW    €%6.2f%n" +
                              "          --------+%n" +
                              "Totaal     €%6.2f%n",
                              0.21 * exBTW, 1.21 * exBTW);
   }
}
