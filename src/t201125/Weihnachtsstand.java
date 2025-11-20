package t201125;

public class Weihnachtsstand {

    // Aufgabe 1.1 – Enum in derselben Datei
    public enum Kategorie {
        GLUEHWEIN,
        GEBAECK,
        DEKO
    }

    private String name;
    private Kategorie kategorie;

    public Weihnachtsstand(String name, Kategorie kategorie) {
        this.name = name;
        this.kategorie = kategorie;
    }

    @Override
    public String toString() {
        return "Weihnachtsstand{name='" + name + "', kategorie=" + kategorie + "}";
    }

    // Aufgabe 1.2 – Test
    public static void main(String[] args) {
        Weihnachtsstand s1 = new Weihnachtsstand("Zum Warmen Becher", Kategorie.GLUEHWEIN);
        Weihnachtsstand s2 = new Weihnachtsstand("Keks-Zauber", Kategorie.GEBAECK);
        Weihnachtsstand s3 = new Weihnachtsstand("Lichterwelt", Kategorie.DEKO);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

