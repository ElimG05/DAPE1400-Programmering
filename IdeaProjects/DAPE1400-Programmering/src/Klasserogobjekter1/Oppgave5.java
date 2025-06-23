package Klasserogobjekter1;
/*Lag en klasse kalt Kalkulator. Denne klassen skal ha 4 statiske metoder som tar inn 2 parametere hver.
Disse statiske metodene skal henholdsvis addere, subtrahere, multiplisere og dividere to desimaltall.

Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer.*/

class Kalkulator {
    public static double addere(double tall1, double tall2) {
        double sum = tall1 + tall2;
        return sum;
    }

    public static double subtrahere(double tall1, double tall2) {
        double sum = tall1 - tall2;
        return sum;
    }

    public static double multiplisere(double tall1, double tall2) {
        double sum = tall1 * tall2;
        return sum;
    }

    public static double dividere(double tall1, double tall2) {
        double sum = tall1 / tall2;
        return sum;
    }
}

    public class Oppgave5 {
        public static void main(String[] args) {
            System.out.println("1.3 + 0.7 er " + Kalkulator.addere(1.3, 0.7));
            System.out.println("1 - 1 er " + Kalkulator.subtrahere(1, 1));
            System.out.println("10 * 10 er " + Kalkulator.multiplisere(10, 10));
            System.out.println("80 / 4 er " + Kalkulator.dividere(80, 4));

        }
    }

