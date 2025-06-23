package Kontrollstruktur1;
//Oppgaver med If og Switch
import static javax.swing.JOptionPane.*;

//b) Lag deretter et program som løser det med bruk av switch.
public class Oppgave5b {
    public static void main(String[] args) {
        String måned = showInputDialog("Skriv inn måneden (navn, ikke tall)");
        switch (måned){
            case "juni":
            case "juli":
            case "august":
                showMessageDialog(null, "Det er sommer");
                break;

            case "september":
            case "october":
            case "november":
                showMessageDialog(null, "Det er høst");
                break;

            case "desember":
            case "januar":
            case "februar":
                showMessageDialog(null, "Det er vinter");
                break;

            case "mars":
            case "april":
            case "mai":
                showMessageDialog(null, "Det er vår");
                break;

                default:
                    showMessageDialog(null, "!Feilkode! Du har skrevet noe feil");
                    break;
        }
    }
}
