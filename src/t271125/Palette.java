package t271125;

public class Palette {
    private String id;
    private Geschenk geschenk;

    public Palette(String id, Geschenk geschenk) {
        this.id = id;
        this.geschenk = geschenk;
    }

    public String getId() { return id; }
    public Geschenk getGeschenk() { return geschenk; }
}
