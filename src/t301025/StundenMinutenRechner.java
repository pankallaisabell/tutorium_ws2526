package t301025;

public class StundenMinutenRechner {
    public static void main(String[] args) {
        int gesamtMinuten = 135;

        int stunden = gesamtMinuten / 60;     // Ganze Stunden
        int minuten = gesamtMinuten % 60;     // Restliche Minuten

        System.out.println(gesamtMinuten + " Minuten sind "
                + stunden + " Stunden und "
                + minuten + " Minuten.");
    }
}
