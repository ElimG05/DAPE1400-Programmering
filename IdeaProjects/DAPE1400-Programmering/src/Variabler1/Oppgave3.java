package Variabler1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*Utvid oppgave 2 med adresse, poststed og postnr. Les inn dataene i flere inputbox'er og skriv det ut i en setning f.eks :
Ole Olsen bor i Osloveien 23 som har postnummer 0470 i Oslo. Ole’s alder er 21 år.*/
public class Oppgave3 {
    public static void main(String[] args) {
        String fornavn;
        fornavn = showInputDialog("Skriv inn fornavn ditt");

        String etternavn;
        etternavn = showInputDialog("Sktiv inn etternavnet ditt");

        String navn;
        navn = fornavn + " " + etternavn;

        String alder;
        alder = showInputDialog("Skriv inn alderen din");

        String adresse;
        adresse = showInputDialog("Skriv inn adressen din");

        String postNr;
        postNr = showInputDialog("Skriv inn postnummeret ditt");

        String poststed;
        poststed = showInputDialog("Skriv inn poststedet ditt");

        showMessageDialog(null, navn + " bor i " + adresse + " som har postnummeret " + postNr + " i " + poststed + ". " + navn + "`s alder er " + alder);
    }
}
