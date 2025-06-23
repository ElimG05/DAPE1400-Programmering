package Eksamen2021;

public class Oppgave1 {
    public static void main(String[] args) {

        //a)
        int sum = 0;
        int antall = 0;
        for (int i=5; i <= 100; i+=5) {
            sum += i;
            antall++;
        }
        double gjennomsnitt = (double) sum/antall;
        System.out.println("Sum med for-løkke:" + sum);
        System.out.println("Gjennomsnitt med for-løkke: " + gjennomsnitt);


        //b)
        int j = 5;
        int sum2 = 0;
        int antall2 = 0;

        while (j <=100){
            sum2 += j;
            antall2++;
            j+=5;
        }
        double gjennomsnitt2 = (double) sum2/antall2;
        System.out.println("Sum med while-løkke: " + sum2);
        System.out.println("Gjennomsnitt med while-løkke: " + gjennomsnitt2);


    }
}
