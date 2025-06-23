package Obliger;

import static javax.swing.JOptionPane.*;
public class Oblig1 {

        public static void main (String[] args){
            String navn;
            navn = showInputDialog("Skriv inn navnet ditt");
            showMessageDialog (null, "Velkommen " + navn);
            showMessageDialog(null, "Håper du har det bra!");
            showMessageDialog (null,  "For tenk at du, " + navn + " har naila oblig 1 allerede!");
        }
    }