package t201125;

public class Plaetzchen {

    private String name;
    private PlaetzchenArt art;

    public Plaetzchen(String name, PlaetzchenArt art) {
        this.name = name;
        this.art = art;
    }

    @Override
    public String toString() {
        return "Plätzchen{name='" + name + "', art=" + art + ", beschreibung='" + art.getBeschreibung() + "'}";
    }
}

