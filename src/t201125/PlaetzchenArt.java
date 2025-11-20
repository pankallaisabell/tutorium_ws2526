package t201125;

public enum PlaetzchenArt {

    VANILLEKIPFERL("Vanillekipferl auf die 1"), // Komma-getrennt
    ZIMTSTERN("würzig und gut"),
    BUTTERPLAETZCHEN("ein einfacher, süßer Klassiker"); // Semikolon am Ende

    private String beschreibung;

    private PlaetzchenArt(String beschreibung) { // wichtig: private
        this.beschreibung = beschreibung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
}
