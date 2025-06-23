package Kontrollstruktur1;
//Oppgaver med If og Switch
import static javax.swing.JOptionPane.*;

/*Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:
Sommer : juni, juli, august
Høst : september, oktober, november
Vinter: desember, januar, februar,
Vår : mars, april, mai,  */

//a) Lag først et program som løser det med if /else
public class Oppgave5a {
    public static void main(String[] args) {
        String måned = showInputDialog("Skriv inn måneden (navn, ikke tall)");
        if (måned.equals("juni") || måned.equals("juli") || måned.equals("august")) {
            showMessageDialog(null, "Det er sommer");
        }

        if (måned.equals("september") || måned.equals("oktober") || måned.equals("november")) {
            showMessageDialog(null, "Det er høst");
        }
        if (måned.equals("desember") || måned.equals("januar") || måned.equals("februar")) {
            showMessageDialog(null, "Det er vinter");
        }
        if (måned.equals("mars") || måned.equals("april") || måned.equals("mai")) {
            showMessageDialog(null, "Det er vår");
        }
    }
}
