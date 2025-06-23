package Variabler2;

/*Endre på programmet i oppgave 3 slik at du sikrer at det skrives inn tall og ikke vanlig tekst i input-boksene.
Bruk try og catch for å få dette til. Dersom det ikke skrives inn tall sett input til 0.*/

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4 {
    public static void main(String[] args) {
        String innTall1 = showInputDialog("Skriv inn et desimaltall");
        String innTall2 = showInputDialog("Skriv inn et desimaltall");
        String innTall3 = showInputDialog("Skriv inn et desimaltall");

        double tall1, tall2, tall3;

        try {
            tall1 = Float.parseFloat(innTall1);
            tall2 = Float.parseFloat(innTall2);
            tall3 = Float.parseFloat(innTall3);

        } catch (Exception e) {
            tall1 = 0;
            tall2 = 0;
            tall3 = 0;

        }
            double sum = tall1 + tall2 + tall3;
            double gjennomsnitt = sum / 3;

            showMessageDialog(null, "Gjennomsnittet av de tre tallene er " + gjennomsnitt);
            System.out.println("Gjennomsnittet av de tre tallene er " + gjennomsnitt);
    }
}
