package Arrays1;
/*Lag et program som sjekker om to heltalls-arrays er like. Bruk løkker, ikke innebygd java klasse/metode.*/

public class Oppgave6 {
    public static void main (String[]args) {
        int [] heltall1 = {1,2,3,4,5,6};
        int [] heltall2 = {1,2,3,4,5,6,7};

        boolean likeArrays = true;

        if (heltall1.length != heltall2.length) {
            likeArrays = false;
        }
        else {
            for(int i = 0; i < heltall1.length; i++) {
                if (heltall1[i] != heltall2[i]) {
                    likeArrays = false;
                    break;
                }
            }
        }
        if (likeArrays) {
            System.out.println("Disse to heltalls-arrays er like");
        }
        else {
            System.out.println("Disse to heltalls-arrays er ikke like");
        }
    }
}
