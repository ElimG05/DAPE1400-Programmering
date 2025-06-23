package FlereEgneEksamensOppgaver;

import java.util.ArrayList;

interface Form {
    String areal();
    double omkretsen();
}

class Firekant implements Form {
    private double lengde;
    private double bredde;

    public Firekant(double lengde, double bredde) {
        this.lengde = lengde;
        this.bredde = bredde;
    }


    @Override
    public String areal() {
        double areal = lengde * bredde;
        return String.format("%.2f",areal);
    }

    @Override
    public double omkretsen() {
        return (lengde * 2) + (bredde * 2);
    }

    @Override
    public String toString() {
        return "Firekant med lengde " + lengde + " cm og bredde " + bredde + " cm." +
                "\nHar " + areal() + " cm^2 i areal og " + omkretsen() + " cm i omskrets.";
    }
}

class Trekant implements Form {
    double høyde;
    double grunnlinje;
    double side1;
    double side2;
    double side3;

    public Trekant(double høyde, double grunnlinje, double side1, double side2, double side3) {
        this.høyde = høyde;
        this.grunnlinje = grunnlinje;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public String areal() {
        double areal = (høyde * grunnlinje)/2;
        return String.format("%.2f",areal);
    }

    @Override
    public double omkretsen() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Trekant med høyde " + høyde + " cm og " + grunnlinje + " cm i grunnlinje. Med sidene: " + side1 + " cm " + side2 + " cm " + side3 + " cm " +
                "\nHar " + areal() + " cm^2 i areal og " + omkretsen() + " cm i omskrets";
    }
}




public class Oppgave9 {
    public static void main(String[] args) {
        ArrayList<Form> formerListe = new ArrayList<>();
        Form rektangel = new Firekant(8.0, 5.0);
        Form kvadrat = new Firekant(6.0, 6.0);
        Form likebeinet = new Trekant(4.0, 6.0, 5.0, 5.0, 6.0);
        Form likesidet = new Trekant(6.06, 7.0, 7.0, 7.0, 7.0);


        formerListe.add(rektangel);
        formerListe.add(kvadrat);
        formerListe.add(likebeinet);
        formerListe.add(likesidet);

        for (Form nyListe : formerListe) {
            System.out.println(nyListe.toString());
            System.out.println();
        }
    }

}
