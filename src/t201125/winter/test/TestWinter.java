package t201125.winter.test;

import t201125.winter.schnee.Schneemann;

public class TestWinter {
    public static void main(String[] args) {

        Schneemann s = new Schneemann("Jens", 120);

        System.out.println(s);

        s.schmelzen(15);
        System.out.println(s);

        s.schmelzen(50);
        System.out.println(s);
    }
}
