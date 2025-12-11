package t111225;

class Workshop extends Veranstaltung {
    private Datum datum;
    private Teilnehmer[] teilnehmer;
    private int teilnehmerAnzahl; // Hilfsvariable für Array-Verwaltung

    public Workshop(String titel, String ort, Datum datum, int maxTeilnehmer) {
        super(titel, ort);
        this.datum = datum;
        this.teilnehmer = new Teilnehmer[maxTeilnehmer];
        this.teilnehmerAnzahl = 0;
    }

    public boolean addTeilnehmer(Teilnehmer t) {
        if (teilnehmerAnzahl < teilnehmer.length) {
            teilnehmer[teilnehmerAnzahl] = t;
            teilnehmerAnzahl++;
            return true;
        }
        System.out.println("Workshop voll!");
        return false;
    }

    @Override
    public Datum getStartDatum() {
        return this.datum;
    }

    @Override
    public String toString() {
        return "Workshop: " + getTitel() + " (" + teilnehmerAnzahl + " Teilnehmer)";
    }
}