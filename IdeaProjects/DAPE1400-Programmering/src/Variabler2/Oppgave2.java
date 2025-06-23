package Variabler2;
/*Lag et program som leser inn tre desimaltall.
Programmet skal så summere disse tallene og vise summen i System.out.*/

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave2 {
    public static void main(String[] args) {

        String innTall1 = showInputDialog("Skriv inn et desimaltall");
        String innTall2 = showInputDialog("Skriv inn et desimaltall");
        String innTall3 = showInputDialog("Skriv inn et desimaltall");

        double tall1 = Float.parseFloat(innTall1);
        double tall2 = Float.parseFloat(innTall2);
        double tall3 = Float.parseFloat(innTall3);

        double sum = tall1 + tall2 + tall3;

        System.out.println("Summene av de tre tallene er " + sum);
    }
}
