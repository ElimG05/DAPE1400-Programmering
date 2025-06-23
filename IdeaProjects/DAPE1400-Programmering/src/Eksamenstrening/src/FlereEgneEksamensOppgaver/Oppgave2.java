package FlereEgneEksamensOppgaver;

//1)
class Kalkulator {

    public static int add(int tall1, int tall2){
        return tall1 + tall2;
    }

    public static double add(double tall1, double tall2, double tall3) {
        return tall1 + tall2 + tall3;
    }
}

//2)
abstract class Figur {

    public abstract double areal();

    public final void beskrivelse() {
        System.out.println("Dette er en figur");
    }

}

class Sirkel extends Figur {
    private double radius;

    public Sirkel(double radius) {
        this.radius = radius;
    }

    @Override
    public double areal() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Sirkel med radius " + radius + " cm har " + (String.format("%.2f", areal())) + " cm^2 i areal";
    }
}

class Rektangel extends Figur {
    private double lengde;
    private double bredde;

    public Rektangel(double lengde, double bredde) {
        this.lengde = lengde;
        this.bredde = bredde;
    }

    @Override
    public double areal() {
        return lengde * bredde;
    }

    @Override
    public String toString() {
        return "Rektangel med lengde " + lengde +
                " cm og bredde " + bredde + " cm har " + (String.format("%.2f", areal())) + " cm^2 i areal";
    }
}


public class Oppgave2 {
    public static void main(String[] args) {
        //1)
        System.out.println("Summen av to heltall: " + Kalkulator.add(2,8));
        System.out.println("Summen av tre desimaltall: " + Kalkulator.add(1.1,2.4,3.5));


        //2)
        Figur sirkel = new Sirkel(2.5);
        Figur rektangel = new Rektangel(2.0,4.0);

        System.out.println(sirkel.toString());
        System.out.println(rektangel.toString());

    }
}
