package Variabler1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*Utvid oppgave 1 med å lese inn alderen.  Programmet skal så vise følgende i meldingsboken (f.eks. inndata):
”Alderen til Ole Olsen er 21 år.”*/
public class Oppgave2 {
    public static void main(String[] args) {
        String fornavn;
        fornavn = showInputDialog("Skriv inn fornavn ditt");

        String etternavn;
        etternavn = showInputDialog("Sktiv inn etternavnet ditt");

        String navn;
        navn = fornavn + " " + etternavn;

        String alder;
        alder = showInputDialog("Skriv inn alderen din");

        showMessageDialog(null, "Alderen til " + navn + " er " + alder + " år");
    }
}
