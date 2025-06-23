package InputOutput;
import java.util.Scanner;

public class testerScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Hva heter du?");
        String navn = s.nextLine();

        System.out.println("Heiii! " + navn + ". Hvordan går det?");
        String tilstand = s.nextLine();

        if (tilstand.equals("det går ikke bra")) {
            System.out.println("Ånei! Du er flink, dette skal tok gå bra");
        }
        else {
            System.out.println("Så fint, godt å høre!");
        }

        System.out.println("Hvor gammel er du? " + navn);
        int alder = s.nextInt();
        System.out.println("Wow! Du er " + alder + " år gammel");
        s.nextLine();

        System.out.println("Hva tror du jeg heter?");
        String navn1 = s.nextLine();
        System.out.println("HAHhaa, du tror at jeg heter " + navn1);

        System.out.println("Hvor gammel tror du jeg er? ");
        int alder1= s.nextInt();
        System.out.println("Wow! Du tror jeg er " + alder1 + " år gammel");





    }





}
