package Kontrollstruktur;
//Andre oppgaver til kontrollstrukturer

import static javax.swing.JOptionPane.*;
/*En salgsperson får kommisjon av salget sitt. Det betyr at vedkommende får 9 % av salget i tillegg til vanlig månedslønn.
Skriv et program som leser prisen på et antall varer selgeren har solgt og regn ut hvor mye tillegg vedkommende er berettiget til.
Bruk inputbokser og avslutt innlesningen når prisen er 0.*/

public class Oppgave2 {
    public static void main(String[] args) {
        double totalpris = 0;

        while (true){
            String innPrisPåVarer = showInputDialog ("Skriv inn prisen på varen du har solgt (kr)");
            double prisPåvarer = Double.parseDouble(innPrisPåVarer);

            if (prisPåvarer == 0) {
                break;
            }

            totalpris += prisPåvarer;
        }
        double tillegg = (totalpris * 9) / 100;
        String p = String.format("%.2f", tillegg);

        showMessageDialog (null, "Du har berettighet til å få " + p + " kr i tilegg til vanlig månedslønn");

    }
}
