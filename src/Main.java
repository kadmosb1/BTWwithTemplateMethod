public class Main {
    public static void main (String [] args) {
        Factuur factuur = new Factuur ();
        factuur.addRegel ("Regel 1:   € 28,50");
        factuur.addRegel ("Regel 2:   € 11,50");
        factuur.addRegel ("Regel 3:   € 15,56");
        System.out.println ("===================\n\n"+
                            "Factuur van normale ondernemer\n");
        factuur.setType(new NormaleOndernemer(55.56));
        factuur.print ();
        System.out.println ("\n===================\n\n" +
                            "Factuur van kleine ondernemer\n");
        factuur.setType(new KleineOndernemerAdapter(55.56));
        factuur.print ();
        System.out.println ("\n===================\n");
    }
}
