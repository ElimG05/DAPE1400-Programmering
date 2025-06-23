package Variabler1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*Endre oppgave 3 slik at det vises følgende i meldingsboksen (f.eks inndata):
Navn : Ole Olsen
Adresse : Osloveien 23
Postnummer : 0470
Poststed : Oslo
Alder : 21 år.
Tips: bruk \n for å få ny linje*/

public class Oppgave4 {
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

        showMessageDialog(null, "Navn : " + navn + "\n" + "Adresse : " + adresse + "\n"  + "Postnummer : " + postNr + "\n" + "Poststed : " + poststed + "\n" + "Alder : " +  alder + " år");
    }
}
