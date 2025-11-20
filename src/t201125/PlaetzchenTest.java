package t201125;

public class PlaetzchenTest {
    public static void main(String[] args) {

        Plaetzchen p1 = new Plaetzchen("Omas Kipferl", PlaetzchenArt.VANILLEKIPFERL);
        Plaetzchen p2 = new Plaetzchen("Sternenzauber", PlaetzchenArt.ZIMTSTERN);
        Plaetzchen p3 = new Plaetzchen("Butterliebling", PlaetzchenArt.BUTTERPLAETZCHEN);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

