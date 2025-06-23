package Aritmetikk;
import static javax.swing.JOptionPane.*;
/*Les inn et tall mellom 0 og 1000 og skriv ut summen av sifrene i tallet (tverrsummen).
F.eks inndata 751 skal gi utdata 7 + 5 + 1 = 13. Tips: 751 % 10 = 1 og 751 / 10 = 75.*/

public class Oppgave11 {
    public static void main(String[] args) {
        String Inntall = showInputDialog("Skriv inn et tall (0-1000)");
        int tall = Integer.parseInt(Inntall);

        int Starttall = tall;

        int s3 = tall % 10;
        tall = tall / 10;
        int s2 = tall % 10;
        int s1 = tall / 10;

        int tverrsum = s1 + s2 + s3;

        showMessageDialog(null, "Tallet " + Starttall + " har tversammen: " + s1 + " + " + s2 + " + " + s3 + " = " + tverrsum );
    }
}

