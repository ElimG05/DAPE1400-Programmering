package FlereEgneEksamensOppgaver;
import java.util.*;

public class Oppgave1 {
    public static void main(String[] args) {

    //1)
    int[][] heltallArray = {{1,2,3},{4,5,6},{7,8,9}};

    int sum = 0;
    for (int i=0; i < heltallArray.length; i++){
        for(int j=0; j < heltallArray[i].length; j++){
            sum+=heltallArray[i][j];
        }
    }
        System.out.println("Summen: " + sum);


    System.out.print("De diagonale elementene: ");
    for (int i=0; i < heltallArray.length; i++){
        for(int j=0; j < heltallArray[i].length; j++){
            if (i == j) {
                System.out.print(heltallArray[i][j] + "," );
            }
        }
    }

/*--------------------------------------------------------------------------------------------------------------*/
    //2
    Scanner scan = new Scanner(System.in);
    ArrayList<String> testListe = new ArrayList<>();

    System.out.println("\nDu skal skrive inn 5 tekststrenger. Skriv inn nr. 1 under:");
    String tekstStrenger1 = scan.nextLine();
    System.out.println("Skriv inn nr. 2 her:");
    String tekstStrenger2 = scan.nextLine();
    System.out.println("Skriv inn nr. 3 her:");
    String tekstStrenger3 = scan.nextLine();
    System.out.println("Skriv inn nr. 4 her:");
    String tekstStrenger4 = scan.nextLine();
    System.out.println("Skriv inn nr. 5 her:");
    String tekstStrenger5 = scan.nextLine();

    testListe.add(tekstStrenger1);
    testListe.add(tekstStrenger2);
    testListe.add(tekstStrenger3);
    testListe.add(tekstStrenger4);
    testListe.add(tekstStrenger5);

    Collections.sort(testListe);
    System.out.println("Alfabetisk sortert: ");
    for(String test : testListe) {
        System.out.println (test);
    }

    System.out.println("Hvilken streg ønsker du å fjerne");
    String fjernTekstStreng = scan.nextLine();
    testListe.remove(fjernTekstStreng);

    System.out.println("Ny Liste: ");
    for(String test : testListe) {
            System.out.println (test);
    }

  }
}
