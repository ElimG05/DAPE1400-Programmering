package Klasserogobjekter1;
/*Lag en klasse kalt Person. Denne skal inneholde følgende attributter:
- navn
- adresse
- telefonnr
- fødselsår

Lag en metode for å regne ut alderen til en person.
Metoden skal ikke ta inn noen parametere, den skal regne ut alderen ut i fra fødselsår.
Metoden skal returnere alderen.

Lag så en metode som, tar inn alderen, og som skriver ut alle vitale data for personen på følgende måte:
Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.

Opprett et eller flere person objekter i main-metoden for å teste ut.*/

class Person{
    String navn;
    String adresse;
    String telefonnr;
    int fødselsår;

    int alder() {
        return 2024 - fødselsår;
    }

    void skrivUt(int alder){
        System.out.println(navn + " med adresse " + adresse + " med telefonnummer" + telefonnr + " er " + alder + " år.");
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        Person person = new Person();
        person.navn = "Per Hansen";
        person.adresse = "Osloveien 82";
        person.telefonnr = "221 24 512";
        person.fødselsår = 2003;
        int alder = person.alder();
        person.skrivUt(alder);
    }
}