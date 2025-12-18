package t181225;

public class Rechner {

    public static int berechne(int x) {
        if (x <= 1) {
            return 1;
        }
        return x + berechne(x - 1);
    }

    public static void main(String[] args) {
        System.out.println(berechne(4));
    }
}

