public class Assignment {
    /**
     * Returns the sum of all the received numbers.
     */
    public int addThreeNumbers(int i, int j, int k) {
        int sum = i+j+k;
        return sum;
    }

    /**
     * Evaluates if the received number is
     * Small (less than 100).
     * Big (greater than 1000).
     * Medium (not small or big)
     */
    public String isNumberSmallMediumOrBig(int number){
        if (number<100) {
        return "Small"; }

        if (number>1000) {
        return "Big"; }

        else {
        return "Medium"; }
    }

    /**
     * Prints course name for provided course code.
     * ADTS1600 -> Interaksjonsdesign og Prototyping
     * DAPE1400 -> Programmering
     * DATA1200 -> Webutvikling og inkluderende design
     * DATA1100 -> Teknologi og samfunn for programmerere
     * or "Unknown" if none of the above.
     */
    public void printCourseName(String courseCode){
        switch (courseCode) {
            case "ADTS1600":
                System.out.println("Interaksjonsdesign og Prototyping");
                break;

            case "DAPE1400":
                System.out.println("Programmering");
                break;

            case "DATA1200":
                System.out.println("Webutvikling og inkluderende design");
                break;

            case "DATA1100":
                System.out.println("Teknologi og samfunn for programmerere");
                break;

            default:
                System.out.println("Unknown");
                break;
        }
    }

    /**
     * Returns true if provided color is represented in the Norwegian flag.
     * Color input is lowercase only.
     */
    public boolean isColorInNorwegianFlag(String color){
        if (color.equals("blue")) {
            return true;
        }
        else if (color.equals("red")) {
            return true;
        }
        else if (color.equals("white")) {
            return true;
        }
        else
            return false;
    }

    /**
     * Returns the combined length of the provided Strings.
     */
    public int combinedLength(String s1, String s2){
        int sum = s1.length() + s2.length();
        return sum ;
    }


    /**
     * Returns the index of the first occurrence of char c in String string.
     * Returns -1 if char is not found.
     */
    public int firstOccurrence(String string, char c){
        int index = string.indexOf(c);
        if (index != -1) {
            return index;
        }
        return -1;
    }

    /**
     * Returns the string without starting spaces only a single trailing space at the end
     * hint: https://www.w3schools.com/java/ref_string_trim.asp
     */
    public String ensureOnlySingleSpaceAtEndOfString(String string){
        return string.trim() + " ";
    }

    /**
     * Return true if string is shorter than or equal to maxChar characters and longer then or equal to minChar characters.
     * hint: https://www.w3schools.com/java/ref_string_length.asp
     */

    public Boolean checkIfStringIsWithinCorrectLength(String string, int maxChar, int minChar){
        if (string.length() <= maxChar && string.length() >= minChar){
            return true;
        }
        return false;
    }

    /**
     * Return True if the string is valid under the following conditions:
     * Only single trailing spaces
     * No starting spaces
     * Must be longer or equal to 6 characters
     * Must be shorter or equal to 60 characters
     * Hint: Maybe its possible to reuse previous methods for this task?
     */
    public Boolean validateString(String string) {
        String vaild = ensureOnlySingleSpaceAtEndOfString(string);

        if (!checkIfStringIsWithinCorrectLength(vaild, 60, 6)) {
            return false;
        }

        return string.equals(vaild);
    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     */
    public void printAllStrings(String[] strings){
        for (String ny : strings) {
            System.out.println(ny);
        }
    }

    /**
     * Returns the sum of all numbers in received array.
     */
    public int arraySum(int[] numbers){
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     * But only if the String is not exactly "Corona".
     */
    public void printAllStringsNotCorona(String[] strings) {
        for (String ny : strings) {
            if (!ny.equals("Corona")) {
                System.out.println(ny);
            }
        }
    }

    /**
     * Returns the sum of all the received numbers.
     * hint: this is called varargs
     */
    public int addNumbers(int... numbers) {
        int sum = 0;
        for (int verdi : numbers) {
            sum += verdi;
        }
        return sum;
    }

    // The following methods are Optional assignments:
    // additional optional assignments might be added later.

    /**
     * Prints the provided strings in upper case letters.
     * One String on each line.
     */
    public void printUpperCaseStrings(String[] strings){
        for (String ny : strings) {
            System.out.println(ny.toUpperCase());
        }
    }

    /**
     * Print all characters until a char is "."
     * including the .
     * Do not print in separate lines.
     */
    public void printFirstSentence(char[] chars) {
        int i = 0;

        while (i < chars.length) {
            System.out.print(chars[i]);

            if (chars[i] == '.') {
                break;
            }

            i++;
        }
    }


    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     * But only if the String is not Corona (case insensitive).
     */
    public void printAllStringsNotCoronaCaseInsensitive(String[] strings){
        for (String ny : strings) {
            if (!ny.equals("cOrOna")) {
                System.out.println(ny);
            }
        }

    }
}
