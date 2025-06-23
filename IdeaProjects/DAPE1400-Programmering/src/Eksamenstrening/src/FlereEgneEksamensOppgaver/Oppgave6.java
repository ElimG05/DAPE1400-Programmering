package FlereEgneEksamensOppgaver;

class Matematikk {

    public static String pi() {
        return (String.format("%.5f", Math.PI));
    }

    public double kvadrat(int tall) {
        return Math.sqrt(tall);
    }
}

public class Oppgave6 {
    public static void main(String[] args) {
        //Denne metoden er static som betyr at vi kan kalle på den gjennom klassen (Matematikk) den er i.
        System.out.println(Matematikk.pi());

        //Denne metoden er ikke-static som betyr at vi kan kun kalle på den gjennom å lage en objekt av type Matematikk.
        Matematikk test = new Matematikk();
        double kvadratrot = test.kvadrat(25);
        System.out.println(kvadratrot);

    }




}
