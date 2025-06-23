package Kontrollstruktur2;
import static javax.swing.JOptionPane.*;
//Oppgaver med For og While
/*Lag en primtallssjekk. Et tall oppgis og det sjekkes om dette tallet er delelig med alle tall fra 1 og opp til det valgte tallet.
Dersom det er delelig bare med 1 og seg selv er det et primtall.*/

public class vanskeligereoppgaver3 {
    public static void main(String[]args){
        String innTall = showInputDialog("Skriv inn et tall");
        int tall = Integer.parseInt(innTall);

        boolean primtall = true;

        if (tall < 2){
            primtall = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(tall); i++){
                if (tall % i == 0){
                    primtall = false;

                }
            }
        }

        if (primtall){
            showMessageDialog(null, "Tallet du skrev inn er et primtall");
        }
        else {
            showMessageDialog(null, "Tallet du skrev inn er ikke et primtall");
        }
    }
}

