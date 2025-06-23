package FlereEgneEksamensOppgaver;
import java.util.ArrayList;

/*Vi bruker polymorfisme i denne oppgaven og det handler om at vi har en metode i interfacen vår Dyr og i klassene Hund og Katt implementerer
vi denne metoden. Men siden lyd er forskjellig for ulike type dyr, overstyrer vi denne metoden og gjør den unik for type Hund og Katt.*/

interface Dyr {
    void lyd();
}

class Hund implements Dyr {
    private String navn;

    public Hund(String navn) {
        this.navn = navn;
    }

    @Override
    public void lyd() {
        System.out.println("voff voff");
    }

    @Override
    public String toString() {
        return "Dette er hunden " +  navn + " og jeg sier: ";
    }
}

class Katt implements Dyr {
    private String navn;

    public Katt(String navn) {
        this.navn = navn;
    }

    @Override
    public void lyd() {
        System.out.println("meow meow");
    }

    @Override
    public String toString() {
        return "Dette er katten " +  navn + " og jeg sier: ";
    }
}



public class Oppgave5 {
    public static void main(String[] args) {
        ArrayList<Dyr> dyrListe = new ArrayList<>();
        Dyr katt1 = new Katt("Parry");
        Dyr katt2 = new Katt("Marry");
        Dyr hund1 = new Hund("Rolf");
        Dyr hund2 = new Hund("Dave");

        dyrListe.add(katt1);
        dyrListe.add(katt2);
        dyrListe.add(hund1);
        dyrListe.add(hund2);


        for (Dyr nyListe : dyrListe) {
            System.out.println(nyListe.toString());
            nyListe.lyd();
            System.out.println();
        }
    }
}
