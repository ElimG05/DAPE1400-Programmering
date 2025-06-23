package Aritmetikk;
import static javax.swing.JOptionPane.*;
/*Les inn verdier for antall pizza, antall personer og antallSlicesPerPizza.
Regn så ut hvor mange pizza-slices hver person får dersom man deler likt gitt at en pizza har f.eks 6 slices hver.
Hvor mange slices er det til overs dersom man deler likt? Bruk modulus operatoren.
Skriv ut resultatet på følgende form: ”Dersom man er 4 personer og har 3 pizzaer får hver person 4 slices og 2 blir til overs”.*/

public class Oppgave7 {
    public static void main(String[] args) {
        String innAntallPizza = showInputDialog("Skriv inn antall pizza");
        String innAntallPersoner = showInputDialog("Skriv inn antall personer");
        String innAntallSlicesPerPizza = showInputDialog("Skriv inn antall slices per pizza");

        int antallPizza = Integer.parseInt(innAntallPizza);
        int antallPersoner = Integer.parseInt(innAntallPersoner);
        int antallSlicesPerPizza = Integer.parseInt(innAntallSlicesPerPizza);
        int antallSlicesPerPerson = (antallPizza * antallSlicesPerPizza) / antallPersoner;
        int rest = (antallPizza * antallSlicesPerPizza) % antallPersoner;

        System.out.println("Dersom man er " + antallPersoner + " personer og har " + antallPizza + " pizzaer får hver person " + antallSlicesPerPerson + " slices og " + rest + " blir til overs" );
    }
}
