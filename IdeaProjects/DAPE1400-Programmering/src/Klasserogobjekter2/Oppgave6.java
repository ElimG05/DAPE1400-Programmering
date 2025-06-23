package Klasserogobjekter2;
import static javax.swing.JOptionPane.*;

class Vind {
    private double vindHastighet = 0;

    public Vind(double vindHastlighet) {
        this.vindHastighet = vindHastlighet;
    }

    public double getVindhastighet() {
        return vindHastighet;
    }

    public boolean erOrkan() {
        if (vindHastighet >= 120) {
            return true;
        }
        return false;
    }

    public boolean erVindstille() {
        if (vindHastighet <= 2) {
            return true;
        }
        return false;
    }

    public double getKnop() {
        double knop = vindHastighet / 1852;
        return knop;
    }

    public int getBeaufort() {
        int beaufort = (int) (Math.pow(vindHastighet / 3.01, 0.6666) + 0.5);
        if  (beaufort > 12) {
            beaufort = 12;
        }
        return beaufort;

    }
}

public class Oppgave6 {
    public static void main(String[] args) {
        String innVindHastighet = showInputDialog("Skriv inn vindhastligheten");
        double vindHastighet = Double.parseDouble(innVindHastighet);

        Vind sjekkVind = new Vind(vindHastighet);
        String skrivUt = "Vindhastligheten er " + sjekkVind.getVindhastighet() + " km/t" + "\n";

        if (sjekkVind.erOrkan()) {
            skrivUt = skrivUt + "Det er orkan" + "\n";
        }
        if (sjekkVind.erVindstille()) {
            skrivUt = skrivUt + "Det er vindstille" + "\n";
        }
        String knop = String.format("%.2f", sjekkVind.getKnop());
        skrivUt = skrivUt + "Det er " + knop + " knop" + "\n";
        skrivUt = skrivUt + "Dette tilsvarer " + sjekkVind.getBeaufort() + " på beaufort-skalaen";

        showMessageDialog(null, skrivUt);
    }
}