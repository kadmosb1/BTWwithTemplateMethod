public class KleineOndernemer {

    private double prijsExclusiefBTW;

    public KleineOndernemer () {
    }

    public void stelEindbedragVast (double prijs) {
        this.prijsExclusiefBTW = prijs;
    }

    public String getLaatsteRegel () {
        return String.format ("%nFactuur is vrijgesteld van OB o.g.v. artikel 25 Wet OB");
    }
}
