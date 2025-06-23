package Arrays2;
/*(litt vanskelig)
Det er definert et to-dimensjonalt helttalls-array (se under). Hver rad tilsvarer en filmanmelders "score" av 4 filmer (kolonner).
  4	  6	 2	 5
  7	  9	 4	 8
  6	  9	 3	 7
Lag et program som beregner gjennomsnittlig "score" for de 4 forskjellige filmene og skriver ut resultatet.*/

public class Oppgave5 {
    public static void main (String[]args) {
        int sum = 0;
        int gjennomsnitt = 0;
        int [][] film = {{4,6,2,5}, {7,9,4,8}, {6,9,3,7}};

        for (int i = 0; i < film.length; i++) {
            sum += i;
        }
        System.out.println(sum);



    }
}
