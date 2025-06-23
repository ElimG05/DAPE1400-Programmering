package EksamenH2018;

class Fag {
    private String navn;
    private String år;
    private Student[] studenter;

    public Fag(String navn, String år, Student[] studenter) {
        this.navn = navn;
        this.år = år;
        this.studenter = studenter;
    }

    public String getNavn(){
        return navn;
    }

    public void setNavn(){
        this.navn = navn;
    }

    public String getÅr() {
        return år;
    }
    public void setÅr(){
        this.år = år;
    }

    public Student[] getStudenter() {
        return studenter;
    }

    public void setStudenter(){
        this.studenter = studenter;
    }


    public String toString(){
        String ut = "Fag: " + navn + ", år " + år;
        for (Student student : studenter) {
            if (student != null) {
                ut = ut + "\n" + student;
            }
        }
        return ut;
        }
}

class Student {
    private String navn;
    private String studNr;

    public Student(String navn, String studNr) {
        this.navn = navn;
        this.studNr = studNr;
    }

    public String getNavn(){
        return navn;
    }

    public void setNavn(){
        this.navn = navn;
    }

    public String getStudNr() {
        return studNr;
    }
    public void setStudNr(){
        this.studNr = studNr;
    }


    public String toString(){
        return "Student: Navn=" + navn + ", StudNr=" + studNr;
    }


}

public class Oppgave1 {
    public static void main (String[]args) {
        Student[] studentene = new Student[10];
        Student kari = new Student("Kari", "88019");
        Student ole = new Student("ole", "90051");

        studentene[0]=kari;
        studentene[1]=ole;

        Fag programmering = new Fag("Programmering", "2020",studentene);

        System.out.println(programmering);

    }
}