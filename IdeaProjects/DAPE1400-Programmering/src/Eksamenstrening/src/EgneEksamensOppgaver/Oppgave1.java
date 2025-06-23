package EgneEksamensOppgaver;

public class Oppgave1 {
    public static void main(String[] args) {
        int[][] tall = {
                {3, 5, -7},
                {10, -2, 8},
                {6, 4, -1}};

        //a)
        int sum = 0;
        for (int i = 0; i < tall.length; i++) {
            for (int j = 0; j < tall[i].length; j++) {
                sum += tall[i][j];
            }
        }
        System.out.println("Summen av alle tall: " + sum);


        //b)
        System.out.println("Tall som er større enn null:");
        for (int i = 0; i < tall.length; i++) {
            for (int j = 0; j < tall[i].length; j++) {
                if (tall[i][j] > 0) {
                    System.out.println(tall[i][j]);
                }
            }
        }

        //c)
        System.out.println("Snu alle rader: ");
        for (int i = 0; i < tall.length; i++) {
            for (int j = tall[i].length-1 ; j >= 0; j--) {
                System.out.println(tall[i][j]);
            }
        }

        //d)
        System.out.println("Som en matrise: ");
        for (int i = 0; i < tall.length; i++) {
            for (int j = 0; j < tall[i].length; j++) {
                System.out.print(tall[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
