package Kontrollstruktur;
//Andre oppgaver til kontrollstrukturer

import static javax.swing.JOptionPane.*;
/*Lag et program som beregner skatten til tre personer. Skatten er 30 % frem til 500.000 kr og 50 % over.
Les inn navn og inntekt på de 3 personene og vis den samme informasjonen med hvor mye skatt de kan forvente seg.*/

class Skatt {
    public static double beregneSkatt (int inntekt) {
        double skatt = 0;
        if (inntekt <= 500000){
            skatt = inntekt * 30 / 100;
        }
        else {
            skatt = (500000 * 30 / 100) + ((inntekt - 500000) * 50 / 100);
        }
        return skatt;
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        String navn1 = showInputDialog("Skriv inn navnet ditt");
        String navn2 = showInputDialog("Skriv inn navnet ditt");
        String navn3 = showInputDialog("Skriv inn navnet ditt");

        String innInntekt1 = showInputDialog("Hvor mye er inntekten din på?");
        String innInntekt2 = showInputDialog("Hvor mye er inntekten din på?");
        String innInntekt3 = showInputDialog("Hvor mye er inntekten din på?");

        int inntekt1 = Integer.parseInt(innInntekt1);
        int inntekt2 = Integer.parseInt(innInntekt2);
        int inntekt3 = Integer.parseInt(innInntekt3);

        double skatt1 = Skatt.beregneSkatt(inntekt1);
        double skatt2 = Skatt.beregneSkatt(inntekt2);
        double skatt3 = Skatt.beregneSkatt(inntekt3);

        showMessageDialog (null, navn1 + "med en inntekt på " + innInntekt1 + " kr kan du forvente deg " + skatt1 + " kr i skatt.");
        showMessageDialog (null, navn2 + "med en inntekt på " + innInntekt2 + " kr kan du forvente deg " + skatt2 + " kr i skatt.");
        showMessageDialog (null, navn3 + "med en inntekt på " + innInntekt3 + " kr kan du forvente deg " + skatt3 + " kr i skatt.");

    }
}
