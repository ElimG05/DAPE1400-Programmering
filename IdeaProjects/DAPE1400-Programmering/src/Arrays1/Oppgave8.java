package Arrays1;
import static javax.swing.JOptionPane.*;
//en litt vanskeligere oppgave
/*Det skal lages et program som beregner gjennomsnittlig poengsummer for et antall elever - poengene er mellom 0 og 100.
Lag et program som først leser inn hvor mange poengsummer som skal leses inn. Så skal det opprettes et heltalls-array med riktig lengde (fra input).
Deretter skal det leses inn poengsummer via en løkke samtidig som arrayet fylles. Tilslutt skal det via en løkke beregnes gjennomsnittlig poengsum også vise dette på skjermen.
(Det er mulig å løse denne oppgaven enklere uten å bruke array, men oppgaven trener på bruk av arrays).
Bruk gjerne try/catch ved parsing av input og spør igjen om tall dersom det ikke er oppgitt riktig.*/


public class Oppgave8 {
    public static void main (String[]args) {
        String innVerdi = showInputDialog("Hvor mange poengsummer som skal leses inn");
        int verdi = Integer.parseInt(innVerdi);

        
    }
}
