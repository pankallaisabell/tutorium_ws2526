package t181225;

public class Zaehler {
    public static void main(String[] args) {
        int geschenke = 0;

        for (int i = 1; i <= 24; i++) {
            if (i % 3 == 0) {
                geschenke += 2;
            } else {
                geschenke++;
            }
        }

        System.out.println(geschenke);
    }
}

