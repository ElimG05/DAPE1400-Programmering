package Variabler1;
/*Endre oppgave 4 slik at utskriften ikke kommer i en meldingsboks, men i System.out*/

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave5 {
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

        System.out.println("Navn : " + navn + "\n" + "Adresse : " + adresse + "\n"  + "Postnummer : " + postNr + "\n" + "Poststed : " + poststed + "\n" + "Alder : " +  alder + " år");
    }
}
