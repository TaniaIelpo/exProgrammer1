package it.develhope.exProgrammers;

/**
 * This class define a Programmer
 */


public class Programmer {

    public String name;
    public int age;
    public boolean wearsGlasses;

    public void drinkCoffe(){
        System.out.println("Espresso is the secret");
    }
    public void printDetails(){
        System.out.println(name+" is a "+age+ " programmer.");
    }

    public void hasGlasses(){
        System.out.println("Is" + name +" wearing glasses? "+ wearsGlasses);
    }
}
