package ProveEksamen;

public class Oppgave3 {
    /*konsekvensen med at jeg velger public vil være at hvem som helst har tilgang til denne metoden
      utenfor denne klassen, noe som kan føre til at den kan bli misbrukt. */
    public static char[] reversed (char[] chars) {
        char[] reversedChar = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            reversedChar[i] = chars[chars.length - 1 - i];
        }
        return reversedChar;
    }


    public static void main(String[] args) {
        char[] testChar = {'a', 'b', 'c', 'd', 'e'};

        System.out.println(reversed(testChar));
    }
}

