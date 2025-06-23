package Arrays1;
/*Lag et program som teller opp antall partall og antall oddetall i et helttalls-array.*/

public class Oppgave7 {
    public static void main(String[]args) {
        int [] heltall = {1,2,3,4,5,6,7,8,9};

        int antallPartall = 0;
        int antallOddetall = 0;

        for (int tall : heltall) {
            if (tall % 2 == 0) {
                antallPartall++;
            }
            else {
                antallOddetall++;
            }
        }
        System.out.println ("Antall partall i dette heltalls-arrayet: " + antallPartall + "\n" + "Antall oddetall i dette heltalls-arrayet: " + antallPartall);



    }
}
