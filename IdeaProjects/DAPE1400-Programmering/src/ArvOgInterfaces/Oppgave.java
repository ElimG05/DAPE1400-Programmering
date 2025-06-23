package ArvOgInterfaces;
import java.util.ArrayList;

class Animal {
    private boolean isBaby;

    public Animal(boolean isBaby) {
        this.isBaby = isBaby;
    }

    public boolean isBaby(){
        return isBaby;
    }

    public void setBaby(boolean baby) {
        isBaby = baby;
    }

    public void animalSound(){
        System.out.println("animal sounds");
    }

    public String toString() {
        return "hei";
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(boolean isBaby,String breed) {
        super(isBaby);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String nybreed) {
        breed = nybreed;
    }


}

class Cat extends Animal {
    private String favouritePlace;

    public Cat(boolean isBaby, String favouritePlace){
        super(isBaby);
        this.favouritePlace = favouritePlace;

    }

    public String getFavouritePlace() {
        return favouritePlace;
    }

    public void setFavouritePlace(String place) {
        favouritePlace = place;
    }

}


public class Oppgave {
    public static void main (String []args) {
        ArrayList<Animal> animal = new ArrayList<>();



    }
}
