public class Main {

    /**
     * Use this main method to call the methods implemented
     * in the Assignment class.
     */
    public static void main(String[] args) {
	    Assignment assignment = new Assignment();
	    // Use the assignment reference to call methods, like this:
        System.out.println(assignment.addThreeNumbers(10,22,5));
        System.out.println();

        System.out.println(assignment.isNumberSmallMediumOrBig(15));
        System.out.println(assignment.isNumberSmallMediumOrBig(160));
        System.out.println(assignment.isNumberSmallMediumOrBig(2024));
        System.out.println();


        assignment.printCourseName("ADTS1600");
        assignment.printCourseName("DAPE1400");
        assignment.printCourseName("DATA1200");
        assignment.printCourseName("DATA1100");
        assignment.printCourseName("DAPE2100");
        System.out.println();


        System.out.println(assignment.isColorInNorwegianFlag("green"));
        System.out.println(assignment.isColorInNorwegianFlag("blue"));
        System.out.println(assignment.isColorInNorwegianFlag("white"));
        System.out.println(assignment.isColorInNorwegianFlag("red"));
        System.out.println(assignment.isColorInNorwegianFlag("yellow"));
        System.out.println();

        System.out.println(assignment.combinedLength("hei","hade"));
        System.out.println();

        System.out.println(assignment.firstOccurrence("vinter", 'e'));
        System.out.println(assignment.firstOccurrence("vår", 'å'));
        System.out.println(assignment.firstOccurrence("sommer", 'm'));
        System.out.println(assignment.firstOccurrence("høst", 'o'));
        System.out.println();

        System.out.println(assignment.ensureOnlySingleSpaceAtEndOfString("   Hei, hvordan går det?"));
        System.out.println();
        System.out.println(assignment.checkIfStringIsWithinCorrectLength("Det er snart jul",10,5));
        System.out.println(assignment.checkIfStringIsWithinCorrectLength("Det er snart jul",20,2));
        System.out.println();

        System.out.println(assignment.validateString(" hei!"));
        System.out.println(assignment.validateString("hei! "));
        System.out.println(assignment.validateString("hei, det er snart helg! "));
        System.out.println(assignment.validateString("Løvet faller sakte fra trærne, og den friske, klare høstluften fyller gatene. "));
        System.out.println();

        String[] nyeOrd = {"DAPE1400", "Programmering", "Oblig3"};
        assignment.printAllStrings(nyeOrd);
        System.out.println();

        int[] tall = {1, 4, 10};
        System.out.println(assignment.arraySum(tall));
        System.out.println();

        String[] strings = {"Pandemi", "Corona", "times!"};
        assignment.printAllStringsNotCorona(strings);
        System.out.println();

        System.out.println(assignment.addNumbers(1,2,3,4,5,6,7,8,9,10));
        System.out.println();

        assignment.printUpperCaseStrings(strings);
        System.out.println();

        char [] a = "Dette er oblig3. Jeg er snart ferdig. ".toCharArray();
        assignment.printFirstSentence(a);
        System.out.println();


        System.out.println();
        String[] b = {"Hei", "Hade", "en", "to" ,"cOrOna", "tre"};
        assignment.printAllStringsNotCoronaCaseInsensitive(b);

    }
}
