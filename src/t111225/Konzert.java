package t111225;

class Konzert extends Veranstaltung {
    private Status ticketStatus;
    private DatumZeit startZeit;

    public Konzert(String titel, String ort, DatumZeit startZeit, Status status) {
        super(titel, ort);
        this.startZeit = startZeit;
        this.ticketStatus = status;
    }

    public Status getStatus() { return ticketStatus; }

    @Override
    public Datum getStartDatum() {
        // Delegiert an das Datum-Objekt innerhalb von DatumZeit
        return startZeit.getDatum();
    }

    @Override
    public String toString() {
        return "Konzert: " + getTitel() + " um " + startZeit + " [" + ticketStatus + "]";
    }
}
