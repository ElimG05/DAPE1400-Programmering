package Arrays1;
/*Bruk arrayet i oppgave 1. Summer alle tallene med en for-løkke.
Finn så gjennomsnittet av alle tallene.
Summer så alle tallene som er større enn 5.Finn så gjennomsnittet av disse. Summer så tallene med en forenklet for-løkke.*/

public class Oppgave2 {
    public static void main (String[]args) {
        int [] liste = {1,2,3,4,5,6,7,8,9};

        int sum = 0;

        for (int i = 0; i < liste.length; i++) {
            sum += liste[i];
        }
        double gjennomsnitt = (double)sum / liste.length;
        System.out.println("Summen av alle tall i listen er " + sum + " og gjennomsnittet er da " + gjennomsnitt);

        sum = 0;
        int t = 0;
        for (int i : liste) {
            if (i > 5){
                sum += i;
                t++;
            }
        }
        gjennomsnitt = (double)sum / t;
        System.out.println("Summen av alle tallene som er større enn 5 i listen er " + sum + " og gjennomsnittet er da " + gjennomsnitt);

    }
}
