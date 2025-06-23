package Kontrollstruktur2;
import static javax.swing.JOptionPane.*;
//Oppgaver med For og While
/*Lag en primtallsgenerator. Det vil si liste ut alle primtall fra 0 og opp til et valgt tall.
Et primtall er et tall som bare er delelig med 1 og seg selv.
 */


public class vanskeligereoppgaver2 {
    public static void main(String[] args) {
        showMessageDialog(null, "Hei. Dette er en primtallsgenerator. Jeg skal liste ut alle primtall fra 0 og opp til et valgt tall." );
        String innØnske = showInputDialog("Skriv inn tall ønsker du at dette skal være?");
        int ønske = Integer.parseInt(innØnske);

        for (int i = 2; i <= ønske; i++) {
            boolean erPrimtall = true;

         for (int j = 2; j < i; j++) {
             if (i % j == 0) {
                 erPrimtall = false;
                 break;
             }

            }
         if (erPrimtall) {
         System.out.println(i);
         }

        }
    }
}
