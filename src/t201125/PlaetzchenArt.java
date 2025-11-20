package t201125;

public enum PlaetzchenArt {

    VANILLEKIPFERL("Vanillekipferl auf die 1"),
    ZIMTSTERN("würzig und gut"),
    BUTTERPLAETZCHEN("ein einfacher, süßer Klassiker");

    private String beschreibung;

    private PlaetzchenArt(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
}
