package Eksamen2023;

import java.util.ArrayList;

class Fag {
    private String fag;
    private String år;

    public Fag(String fag, String år) {
        this.fag = fag;
        this.år = år;
    }

    public String getFag() {
        return fag;
    }

    public void setFag(String fag) {
        this.fag = fag;
    }

    public String getÅr() {
        return år;
    }

    public void setÅr(String år) {
        this.år = år;
    }

    @Override
    public String toString() {
        return "Fag: " + fag + ", år: " + år;
    }
}


class Student {
    private String navn;
    private String studNr;

    public Student(String navn, String studNr) {
        this.navn = navn;
        this.studNr = studNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getStudNr() {
        return studNr;
    }

    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }

    @Override
    public String toString() {
        return "Student: Navn = " + navn + ", StudNr = " + studNr;
    }
}

public class Oppgave4 {
    public static void main(String[] args) {
        Fag fag = new Fag("Programmering", "2020");
        Student kari = new Student("Kari Olsen", "S234556");
        Student ole = new Student("Ole Hansen", "S356734");

        Student[] student = new Student[10];

        student[0]= kari;
        student[1]= ole;

        System.out.println(fag);
        for(Student studenter : student) {
            if (studenter != null) {
                System.out.println(studenter);
            }
        }



    }

}
