package Obliger;


// Klasse for å representere omgivelsene
class Verden {
    boolean regner;
    int dag; // 1 er Mandag, 2 er Tirsdag, ..., 7 for Søndag, 8 er Mandag...

    // endre metoden for å returnere true hvis det er søndag (hint: Modulo %)
    public boolean erSondag() {
        return dag % 7 == 0;
    }
}

class Robot {
    // gi robotten 4 attributter: navn, batteriNivaa, avstandTilParken og botType
    String navn;
    double batteriNivaa;
    double avstandTilParken;
    String botType;

    // Endre metoden slik at den retunerer en tekst streng som forklarer statusen til roboten
    // eksempel: Dette er bot Dancatron 4000 av type B-Bot.
    // Denne enheten har 80.0 batterikapasitet igjen og bor 1500 meter fra parken.
    public String giStatus(){
        return "Dette er bot " + navn + " av type " + botType + "." + "\n" + "Denne enheten har " + batteriNivaa + " batterikapasitet igjen og bor " + avstandTilParken + " meter fra parken." + "\n";
    }

    // Metode for å sjekke om roboten kan gå til parken basert på omgivelsene
    public boolean gaaTilParken(Verden verden) {
        System.out.println(navn + " sjekker om det er mulig å gå til parken...");

        // Sjekk om det regner
        if (verden.regner){
            // skriv ut hvorfor boten ikke kan gå i parken med System.out.println
            System.out.println("Ånei! Det regner. Da kan ikke " + navn + " gå i parken." + "\n");
            return false;
        }


        // Sjekk om det er søndag. Kan bare gå i parken på søndager.
        if (!verden.erSondag()) {
            System.out.println("I dag er det ikke søndag og " + navn + " kan derfor ikke gå i parken" + "\n");
            return false;
        }


        // Sjekk batterinivå. En bot trenger 1% batterinivå per 100 meter for å gå til parken.
        double batteriBehov = avstandTilParken / 100;
        if (batteriNivaa < batteriBehov) {
            System.out.println(navn + " har ikke nok batterikapasitet for å gå til parken" + "\n");
            return false;
        }

        System.out.println("Wii!! " + navn + " kan gå til parken idag!" + "\n");
        return true;
    }

    // lag en metode som sjekker om boten kan være med på danseklubben
    public boolean vareMedPåDanseKlubben (Verden verden) {
        System.out.println(navn + " sjekker om det er mulig å være med på danseklubben...");

        // bottypen må være av type B-Bot (hint .equals)
        if (!botType.equals("B-bot")) {
            System.out.println(navn + " er ikke av type B-bot og kan derfor ikke være med på danseklubben." + "\n");
            return false;
        }

        // En bot trenger minimum 50% batterikapasitet for å være med
        if (batteriNivaa < 50) {
            System.out.println ("Ånei! " + navn + " har kun " + batteriNivaa + " batterikapasitet, den trenger minimum 50 for å være med på danseklubben.");
            return false;
        }

        // Det kan ikke være mandag. Da er danseklubben stengt.
        if (verden.dag % 7 == 1) {
           System.out.println("I dag er det mandag og danseklubben er desverre stengt");
           return false;
        }
        System.out.println("Wii!! " + navn + " kan være med på danseklubben" + "\n");
        return true;
    }
}

public class RobotOppgave {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)
        Verden dagensVerden = new Verden();
        dagensVerden.regner = false;
        dagensVerden.dag = 700;

        // Oppretter to Robot-objekter
        // med navn, f.eks. Dancatron 4000 og Spark-E
        // med botType "B-Bot" og "Toaster"
        // med forskjellig batterinivå
        // med forskjellig avstand til parken
        Robot robot1 = new Robot();
        robot1.navn = "Dancatron 4000";
        robot1.botType = "B-bot";
        robot1.batteriNivaa = 55;
        robot1.avstandTilParken = 200;


        Robot robot2 = new Robot();
        robot2.navn = "Spark-E";
        robot2.botType = "Toaster";
        robot2.batteriNivaa = 99;
        robot2.avstandTilParken = 500;

        // print ut statusen til begge robottene
        System.out.println(robot1.giStatus());
        System.out.println(robot2.giStatus());


        // Sjekker om robotene kan gå til parken
        robot1.gaaTilParken(dagensVerden);
        robot2.gaaTilParken(dagensVerden);


        // Sjekker om robotene kan gå til danseklubben
        robot1.vareMedPåDanseKlubben(dagensVerden);
        robot2.vareMedPåDanseKlubben(dagensVerden);
    }
}
