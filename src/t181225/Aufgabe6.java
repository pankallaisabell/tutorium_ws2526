package t181225;

public class Aufgabe6 {
    static Plaetzchen a = new Plaetzchen("Vanille", 5);
    static Plaetzchen b = new Plaetzchen("Vanille", 5);

    public static void main(String[] args) {
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
