package t111225;

class Teilnehmer {
    private String name;

    private int nummer;
    private Datum gebDatum;

    public Teilnehmer(String name, int nummer, Datum gebDatum) {
        this.setName(name);
        this.setNummer(nummer);
        this.setGebDatum(gebDatum);
    }

    @Override
    public String toString() {
        return name + " (" + nummer + ")";
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Datum getGebDatum() {
        return gebDatum;
    }

    public void setGebDatum(Datum gebDatum) {
        this.gebDatum = gebDatum;
    }
}
