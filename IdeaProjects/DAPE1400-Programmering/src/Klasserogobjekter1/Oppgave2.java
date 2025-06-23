package Klasserogobjekter1;
/*Utvid oppgave 1 til å lese inn de nødvendige dataene fra input-bokser og skrive resultatet ut i en meldingsboks.*/

import static javax.swing.JOptionPane.*;

class Bøker1 {
    String tittel;
    double pris;
    String forfatter;
    String iSBN_nummer;


    void skrivUt() {
        showMessageDialog(null, "Tittelen er: " + tittel + "\n" + "Prisen er: " + pris + "\n" + "Forfatteren er: " + forfatter + "\n" + "iSBN-nummeret er: " + iSBN_nummer );
    }
}

public class Oppgave2 {
    public static void main(String[] args) {
        Bøker1 bok1 = new Bøker1();
        String tittel = showInputDialog("Skriv inn tittelen");
        String innPrisen = showInputDialog("Skriv inn prisen");
        String forfatter = showInputDialog("Skriv inn forfatter");
        String iSBN_nummer = showInputDialog("Skriv inn iSBN-nummeret");

        double pris = Double.parseDouble(innPrisen);

        bok1.tittel = tittel;
        bok1.pris = pris;
        bok1.forfatter = forfatter;
        bok1.iSBN_nummer = iSBN_nummer;

        bok1.skrivUt();
    }
}