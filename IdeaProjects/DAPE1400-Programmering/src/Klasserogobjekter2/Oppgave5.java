package Klasserogobjekter2;
// nødvendige import-setning(er)
import static javax.swing.JOptionPane.*;

 class Konto {
  //  Attributtene for kontoinnehavers navn, kontornummer og saldo.
  private String navn;
  private String kontonummer;
  private double saldo;

  //  Kontruktør som skal gi startverdier til ALLE attributtene
  public Konto(String navn, String kontonummer, double saldo) {
   this.navn = navn;
   this.kontonummer = kontonummer;
   this.saldo = saldo;
  }

  /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens navn, kontonummer og saldo i et dialogvindu. */
  public void kontoUtskrift() {
   showMessageDialog(null, "Kontoinnehaverens: " + navn + "\n" + "Kontonummer: " + kontonummer + "\n" + "Saldo: " + String.format("%.2f", saldo) + " kr");
  }

 /* Metode som setter inn et beløp på kontoen.
       Beløpets størrelse skal tas imot via en parameter til metoden.
       Metoden skal returnere en tekst som inneholder informasjon om den nye saldoen.  */

  public String settInn(double beløp) {
   saldo = saldo + beløp;
   return "Den nye saldoen er " + String.format("%.2f", saldo) + " kr";
  }


  /* Metode som tar ut et beløp fra kontoen, under forutsetning av at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */

  public String taUt(double beløp) {
   String skrivUt = "";
   if (beløp <= saldo) {
    saldo = saldo - beløp;
    skrivUt = "Den nye saldoen er " + String.format("%.2f", saldo) + " kr";

   }
   else {
    skrivUt = "Det er ikke dekning på konto";
   }
   return skrivUt;
  } // end of class Konto
 }

 public class Oppgave5 {
   public static void main(String[] args) {
    /* Opprett et Konto-objekter, som ved opprettelsen blir tilført
        navn, kontonummer og saldo. */
    String navn = showInputDialog("Skriv inn kontoinnehavers navn");
    String kontonummer = showInputDialog("Skriv inn kontonummeret");
    String innSaldo = showInputDialog("Skriv inn saldo");
    double saldo = Double.parseDouble(innSaldo);

    Konto k = new Konto(navn, kontonummer, saldo);

    /* Test ut ALLE metodene du har laget i Konto-klassen på
        Konto-objektene. Skriv resultatene av metodene ut på System.out.
        Bruk dialogvinduer til både innlesing og utskrift av kontoinformasjon */

    System.out.println(k.settInn(100));
    System.out.println(k.taUt(200));
    System.out.println(k.settInn(300));
    k.kontoUtskrift();

   }
  } // end of class Kontotest