package FlereEgneEksamensOppgaver;

class StringVerktøy {

    public static boolean erPalindrom(String etOrd) {

        etOrd = etOrd.toLowerCase();
        String revOrd = "";
        for (int i=etOrd.length() -1; i >= 0; i--) {
           revOrd += etOrd.charAt(i);
        }

        return etOrd.equals(revOrd);
    }

    public StringBuilder byttCase(String etOrd) {
        StringBuilder resultat = new StringBuilder();

        char[] i = etOrd.toCharArray();

        for (char c : i) {
            if (Character.isUpperCase(c)) {
                resultat.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                resultat.append(Character.toUpperCase(c));
            } else {
                resultat.append(c);
            }
        }

        return resultat;
    }

    public static String finnLengsteOrd(String tekst) {
        String[] ord = tekst.split(" ");
        String lengsteOrd = "";

        for (String ordet : ord) {
            if (ordet.length() > lengsteOrd.length()) {
                lengsteOrd = ordet;
            }
        }

        return lengsteOrd;
    }

}


public class Oppgave15 {
    public static void main(String[] args) {
        StringVerktøy test = new StringVerktøy();

        System.out.println(StringVerktøy.erPalindrom("radar"));
        System.out.println(test.byttCase("HALLo"));
        System.out.println(StringVerktøy.finnLengsteOrd("hallo på deg matematikk lengde"));

    }
}
