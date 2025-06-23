package Eksamen2023;

import java.util.List;

class Liste {

    //1.
    public static int storreEnnNull(int[] heltall){
        int antallStorreEnnNull = 0;
        for(int i=0; i < heltall.length; i++) {
            if (heltall[i] > 0) {
                antallStorreEnnNull++;
            }
        }
        return antallStorreEnnNull;
    }

    //2.
    public static void tallForekomst (int[] heltall, int tall) { //oppgaven sier ikke noe spesifikk om metoden skal retunere noe, så velger selv å gjøre metoden void
        int antallForkomst = 0;
        for(int i=0; i < heltall.length; i++) {
            if (heltall[i] == tall) {
                antallForkomst++;
            }
        }
        System.out.println("Forekomst av tallet " + tall + ": " + antallForkomst);
    }

    //3.
    public static void finnStorstVerdi (int[] heltall) { //oppgaven sier ikke noe spesifikk om metoden skal retunere noe, så velger selv å gjøre metoden void
        int storstVerdi = heltall[0];
        for(int i=0; i < heltall.length; i++) {
            if (storstVerdi < heltall[i]) {
                storstVerdi = heltall[i];

            }
        }
        System.out.println("Det største tallet i arrayet: " + storstVerdi);


    }



}

public class Oppgave2 {
    public static void main(String[] args) {
        int[] heltallArray = {60,-1,10,-5,4,7,10,10,30,10,10,40};

        System.out.println("" + Liste.storreEnnNull(heltallArray));
        Liste.tallForekomst(heltallArray,10);
        Liste.finnStorstVerdi(heltallArray);
    }
}
