package t201125.winter.schnee;

public class Schneemann {

    private String name;
    private int groesse; // in cm

    public Schneemann(String name, int groesse) {
        this.name = name;
        this.groesse = groesse;
    }

    public void schmelzen(int cm) {
        groesse -= cm;
        if (groesse < 0) {
            groesse = 0;
        }
    }

    @Override
    public String toString() {
        return "Schneemann{name='" + name + "', groesse=" + groesse + " cm}";
    }
}
