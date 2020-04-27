public class KleineOndernemerAdapter extends Eindafrekening {

    KleineOndernemer kleineOndernemer;

    public KleineOndernemerAdapter (double prijsMetKorting) {
        super (prijsMetKorting);
        kleineOndernemer = new KleineOndernemer();
        kleineOndernemer.stelEindbedragVast(prijsMetKorting);
    }

    @Override
    public String getTotaalOfSubtotaal() {
        return "Totaal";
    }

    @Override
    public String toString () {
        return String.format (kleineOndernemer.getLaatsteRegel() + "%n");
    }
}
