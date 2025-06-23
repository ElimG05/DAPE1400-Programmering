package Kontrollstruktur;
//Andre oppgaver til kontrollstrukturer

import static javax.swing.JOptionPane.*;
/*Lag et program som regner ut hvor mye en bil bruker i bensin på ulike turer.
Programmet skal lese inn to og to verdier, lengden på turen i km og hvor mye bensin som ble brukt.
Les inn ved hjelp av inputbokser (JOptionPane).
Når lengden på turen er 0 eller negativ avsluttes innlesningen og det skrives ut hvor mye gjennomsnittlig bensin bilen har brukt pr mil. */

public class Oppgaver1 {
    public static void main (String[]args){
        double totalKm = 0;
        double totalBensin = 0;

        while (true) {
        String lengdePåtur = showInputDialog("Hva var lengden på turen (km)");
        double tur = Double.parseDouble(lengdePåtur);
        if (tur <= 0) {
            break;
        }

        String mengdenBruktBensin = showInputDialog("Hvor mye bensin ble brukt?");
        double bensin = Double.parseDouble(mengdenBruktBensin);

        totalKm += tur;
        totalBensin += bensin;

        }

        if (totalKm > 0) {
            double totalMil = totalKm / 10;
            double gjennomsnitt = totalBensin / totalMil;
            String gjennomsnittBensin = String.format("%.3f", gjennomsnitt);

            showMessageDialog (null, "Gjennomsnittlig bensinforbruk pr mil er: " + gjennomsnitt);
        }
        else {
            showMessageDialog (null, "Ingen reiser ble registert");
        }



    }

}
