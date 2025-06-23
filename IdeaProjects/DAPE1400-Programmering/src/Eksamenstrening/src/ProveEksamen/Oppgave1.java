package ProveEksamen;

public class Oppgave1 {
    public static void investigateStringArray(String[] strings) { //gjør den static for å kunne enklere kalle på den

        int antallNullVerdier = 0;
        int antallChars = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                antallNullVerdier++;
            }
            else {
                antallChars = antallChars + strings[i].length();

                if (strings[i].contains("a")) {
                    System.out.println(strings[i]); //alt som inneholder bokstaven "a"
                }
            }

        }
        System.out.println("Antall null-verdier i dette arrayet: " + antallNullVerdier); //null verdier
        System.out.println("Antall tegn i dette arrayet: " + antallChars); //antall bokstaver i arrayet
    }


    public static void main(String[] args) {
        String[] array = {"Bannan", null, "Ris", "Stol", "Test", "Java", "Eksamen", null};

        investigateStringArray(array);
    }

}
