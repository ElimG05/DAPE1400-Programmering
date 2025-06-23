package FlereEgneEksamensOppgaver;

class MatematikkVerktoy {

    public int multiplikasjon(int tall1, int tall2) {
        return tall1 * tall2;
    }

    public String multiplikasjon(double tall1, double tall2, double tall3) {
        double multiplikasjon = tall1 * tall2 * tall3;
        return String.format("%.2f", multiplikasjon);
    }

    public static int faktoriell(int tall) {

        int faktoriell = 1;
        for (int i=1; i <= tall; i++) {
            faktoriell = faktoriell * i;
        }

        return faktoriell;
    }

    public double gjennomsnitt(int[]array) {
        int sum = 0;
        int antall = 0;

        for (int nyArray : array) {
            sum+=nyArray;
            antall++;
        }

        double gjennomsnitt = (double) sum/antall;

        return gjennomsnitt;
    }

}

public class Oppgave12 {
    public static void main(String[] args) {
        MatematikkVerktoy multi1 = new MatematikkVerktoy();
        int[] arrayMedTall = {1,2,3,4,5,6,7};

        System.out.println(multi1.multiplikasjon(2,6));
        System.out.println(multi1.multiplikasjon(1.1,2.0,3.4));
        System.out.println(multi1.gjennomsnitt(arrayMedTall));
        System.out.println(MatematikkVerktoy.faktoriell(3));

    }
}
