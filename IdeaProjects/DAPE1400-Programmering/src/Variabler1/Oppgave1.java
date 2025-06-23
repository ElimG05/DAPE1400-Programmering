package Variabler1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*Lag et program som leser inn en persons fornavn og etternavn hver for seg (altså i to forskjellige input-bokser),
skjøter dem sammen, og skriver det fullstendige navnet ut igjen som del av en passende tekst i en meldingsboks. Bruk passende ledetekster ved innlesing,
slik at brukeren forstår hva som skal skrives inn.
 */
public class Oppgave1 {
    public static void main(String[] args) {
        String fornavn;
        fornavn = showInputDialog("Skriv inn fornavn ditt");

        String etternavn;
        etternavn = showInputDialog("Sktiv inn etternavnet ditt");

        String navn;
        navn = fornavn + " " + etternavn;

        showMessageDialog(null, navn);
    }
}
