package t111225;

// Klasse DatumZeit (Komposition)
class DatumZeit {
    private Datum datum;
    private Zeit zeit;

    public DatumZeit(Datum datum, Zeit zeit) {
        this.datum = datum;
        this.zeit = zeit;
    }

    public Datum getDatum() { return datum; }
    public Zeit getZeit() { return zeit; }

    @Override
    public String toString() {
        return datum.toString() + " " + zeit.toString();
    }
}
