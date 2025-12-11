package t111225;

class Datum {
    private int tag;
    private int monat;
    private int jahr;

    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public int getTag() { return tag; }
    public int getMonat() { return monat; }
    public int getJahr() { return jahr; }

    // Hilfsmethode für den Vergleich später (gibt z.B. YYYYMMDD als int zurück)
    public long toSortableInt() {
        return jahr * 10000L + monat * 100L + tag;
    }

    @Override
    public String toString() {
        return tag + "." + monat + "." + jahr;
    }
}