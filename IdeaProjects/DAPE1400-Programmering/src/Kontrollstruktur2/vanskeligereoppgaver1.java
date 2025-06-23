package Kontrollstruktur2;
import static javax.swing.JOptionPane.*;
//Oppgaver med For og While
/*Beregn Pi med 10 desimalers nøyaktighet. Pi med 12 desimaler er 3.14159265358. Bruk en løkke til å beregne pi ved hjelp av denne rekken:

Pi=4-4/3+4/5-4/7+4/9-4/11+....

Lag en innlesning av antall ledd i rekken (omganger i løkken) slik at det er mulig å variere hvor mange som trengs for å oppnå en presisjon på 10 siffer.

Tips: Bruk long isteden for int for å ha mulighet for stort nok tall i løkken.*/

public class vanskeligereoppgaver1 {
    public static void main(String[] args) {
        String innAntall = showInputDialog("Skriv inn antall ledd for å beregne Pi: ");
        double antall = Double.parseDouble(innAntall);

        double pi = 0.0;

        for (long i = 0; i < antall; i++) {
            long n = i * 2 + 1;

            if (i % 2 == 0) {
                pi += 4.0 / n;
            }
            else {
                pi -= 4.0 / n;
            }
        }

        String nøyaktigPi = String.format("%.9f", pi);

        System.out.println(nøyaktigPi);


    }
}
