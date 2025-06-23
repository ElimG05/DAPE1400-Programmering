package Kontrollstruktur1;
//Oppgaver med If og Switch
import static javax.swing.JOptionPane.*;

/*Definer så en variabel som indikerer høyeste alder man kan ta førerkort uten årlig legesjekk (= 70 år). Oppdater oppgavene over slik at programmet skriver ut meldingene

Du er for ung til å ta førerkort for bil
Du kan ta førerkort for bil og du trenger ikke årlige legesjekker
Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker*/



public class Oppgave4 {
    public static void main(String[] args) {
            String innAlder = showInputDialog("Skriv inn alderen din");
            int alder = Integer.parseInt(innAlder);

            if (alder < 18) {
                showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
            }
            else if (alder < 70) {
                showMessageDialog(null, "Du kan ta førerkort for bil og du trenger ikke årlige legesjekker");
            }
            else {
                showMessageDialog(null, "Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
            }

        }
    }
