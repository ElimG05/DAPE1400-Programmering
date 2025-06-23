package Eksamen2023;

public class Oppgave1 {
    public static void main(String[] args) {
        int[] heltall = {-3,41,5,-3,2,49};

        //a)
        int storreEnnTi = 0;
        for (int i=0; i < heltall.length; i++) {
            if (heltall[i] > 10) {
                storreEnnTi++;
            }
        }
        System.out.println(storreEnnTi);


        //b)
        for (int i=0; i < heltall.length; i+=2) {
            System.out.println(heltall[i]);
        }

        //c)
        int sum = 0;
        for (int i=0; i < heltall.length; i++) {
            if(heltall[i] > 0) {
                sum += heltall[i];
            }
        }
        System.out.println(sum);

        //d)
        int antallPositiveTall = 0;
        for (int i=0; i < heltall.length; i++) {
            if(heltall[i] > 0) {
                antallPositiveTall++;
            }
        }
        double gjennomsnitt = (double) sum/antallPositiveTall;
        System.out.println(gjennomsnitt);

    }
}
