package Variabler2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*Utvid programmet i oppgave 2 og beregn gjennomsnittet av tallene som er lest inn.
Vis så dette resultatet via 1) Meldingsboks og 2) System.out.*/
public class Oppgave3 {
    public static void main(String[] args) {

        String innTall1 = showInputDialog("Skriv inn et desimaltall");
        String innTall2 = showInputDialog("Skriv inn et desimaltall");
        String innTall3 = showInputDialog("Skriv inn et desimaltall");

        double tall1 = Float.parseFloat(innTall1);
        double tall2 = Float.parseFloat(innTall2);
        double tall3 = Float.parseFloat(innTall3);

        double sum = tall1 + tall2 + tall3;
        double gjennomsnitt = sum/3;

        //1)
        showMessageDialog(null, "Gjennomsnittet av de tre tallene er " + gjennomsnitt);

        //2)
        System.out.println("Gjennomsnittet av de tre tallene er " + gjennomsnitt);
    }
}
