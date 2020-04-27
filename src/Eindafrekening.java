public abstract class Eindafrekening {

    private double eindbedragExclusiefBTW;

    public Eindafrekening(double eindbedragExclusiefBTW) {
        this.eindbedragExclusiefBTW = eindbedragExclusiefBTW;
    }

    public double getEindbedragExclusiefBTW () { return eindbedragExclusiefBTW; }

    public abstract String getTotaalOfSubtotaal();

    @Override
    public abstract String toString();

    public void print() {
        System.out.format("          --------+%n" +
                          "%-9s  €%6.2f%n" +
                          "%s",
                          getTotaalOfSubtotaal(),
                          getEindbedragExclusiefBTW (),
                          this);
    }
}