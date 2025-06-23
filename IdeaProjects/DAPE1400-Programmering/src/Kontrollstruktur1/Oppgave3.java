package Kontrollstruktur1;
//Oppgaver med If og Switch
import static javax.swing.JOptionPane.*;

/*Gjør oppgave 2 ved hjelp av en else-setning (i tillegg til en if).*/
public class Oppgave3 {
    public static void main(String[] args) {
        String innAlder = showInputDialog("Skriv inn alderen din");
        int alder = Integer.parseInt(innAlder);

        if (alder >= 18) {
            showMessageDialog(null, "Du kan ta førerkortet for bil da du er gammel nok");
        }
        else {
            showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }

    }
}
