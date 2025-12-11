package t111225;

class Messe extends Veranstaltung {
    private Datum datum;

    public Messe(String titel, String ort, Datum datum) {
        super(titel, ort);
        this.datum = datum;
    }

    @Override
    public Datum getStartDatum() {
        return this.datum;
    }

    @Override
    public String toString() {
        return "Messe: " + getTitel() + " am " + datum;
    }
}
