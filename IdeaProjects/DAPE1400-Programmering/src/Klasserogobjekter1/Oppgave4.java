package Klasserogobjekter1;
import static javax.swing.JOptionPane.*;

/* Utvid oppgave 3 med å lese inn dataene fra input-bokser og vise resultatet i en meldingsboks på følgende format:

- Navn: Per Hansen
- Adresse : Osloveien 82
- Telefonnr : 22124512
- Alder : 21 år.

Tips: bruk \n for å få ny linje. */

class person {
    String navn;
    String adresse;
    String telefonnr;
    int fødelsesår;

    int alder(){
        return 2024 - fødelsesår;
    }

    void skrivUt(int alder){
        showMessageDialog(null, "Navn: " + navn + "\n" + "Adresse: " + adresse + "\n" + "Telefonnr: " + telefonnr + "\n" + "Alder: " + alder() + " år.");
    }
}

public class Oppgave4 {
    public static void main(String[] args) {
        person person1 = new person();
        String navn = showInputDialog("Skriv inn navnet ditt (fornavn + etternavn)");
        String adresse = showInputDialog("Skriv inn adressen din");
        String telefonnr = showInputDialog("Skriv inn telefonnummeret ditt");
        String innFødelsesår = showInputDialog("Skriv inn fødelsesåret ditt");

        int fødelsesår = Integer.parseInt(innFødelsesår);

        person1.navn = navn;
        person1.adresse = adresse;
        person1.telefonnr = telefonnr;
        person1.fødelsesår = fødelsesår;

        int alder = person1.alder();
        person1.skrivUt(alder);

    }
}