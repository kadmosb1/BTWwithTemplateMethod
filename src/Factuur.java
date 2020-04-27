import java.util.ArrayList;

public class Factuur {

    /*
     * Dit is een vereenvoudiging van de Factuur-applicatie waarmee we vorige week
     * hebben gewerkt om de theorie van code smells handen en voeten te geven. Deze
     * applicatie is bedoeld om voor de eerste keer zelf een Strategy Pattern toe
     * te passen.
     */
    public ArrayList<String> regels;
    Eindafrekening eindafrekening;

    public Factuur () {
        regels = new ArrayList<>();
    }

    public void addRegel (String regel) {
        regels.add (regel);
    }

    public void setType (Eindafrekening type) {
        this.eindafrekening = type;
    }

    public void print () {

        for (String regel : regels) {
            System.out.println (regel);
        }

        eindafrekening.print ();
    }
}
