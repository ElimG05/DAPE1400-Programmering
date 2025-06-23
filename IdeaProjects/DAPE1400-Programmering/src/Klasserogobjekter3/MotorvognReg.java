package Klasserogobjekter3;
/*Det skal lages et motorvognregister.
Skallkoden for dette følger under. Ta utgangspunkt i koden og fullfør den der det står kommentarer.*/

class Dato {
    private int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

    private static String månedsnavn( int mnd ) {
        String[] navn = { "Januar", "Februar", "Mars", "April", "Mai",
                "Juni", "Juli", "August", "September", "Oktober", "November",
                "Desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

    public String toString() {
        return dag + "." + månedsnavn(måned) + "." +  år;
    }
}

class Bil{
    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer

    public String type;
    public Dato førstegangsregistrert;
    public String kjennetegn;

    // lag også konstruktør for alle attributtene
    public Bil (String type, Dato førstegangsregistrert, String kjennetegn) {
        this.type = type;
        this.førstegangsregistrert = førstegangsregistrert;
        this.kjennetegn = kjennetegn;
    }

    // lag så en toString metode for å vise alle attributtene
    public String toString() {
        String nyString = "Typebetegnelse: " + type + "\n" + "Førstegangs registrertdato: " + førstegangsregistrert + "\n" + "Kjennetegn: " + kjennetegn;
        return nyString;
    }

}

public class MotorvognReg {

    public static void main(String[] args) {
        // opprett et array av Biler
        Bil[] register = new Bil[180];

        // Sett inn noen biler i arrayet
        Dato dato1 = new Dato(4, 5, 2005);
        Bil vovlo = new Bil("Volvo", dato1, "XR15527");

        Dato dato2 = new Dato(31, 1, 2003);
        Bil audi = new Bil("Audi", dato2, "PT22180");

        Dato dato3 = new Dato(4, 5, 1997);
        Bil ford = new Bil("Volvo", dato3, "AT90821");


        register[0] = vovlo;
        register[1] = audi;
        register[2] = ford;


        // List motorvognregisteret (arrayet) ved hjelp av en løkke
        for (Bil biler : register) {
            if (biler != null) {
                System.out.println(biler);
                System.out.println("----------------------");
            }
        }
    }
}

