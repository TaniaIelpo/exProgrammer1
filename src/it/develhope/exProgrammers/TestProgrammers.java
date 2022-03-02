package it.develhope.exProgrammers;

/**
 * This class tests the first exercise
 */

public class TestProgrammers {
    public static void main(String[] args) {

        /**
         * programmers create
         */
        Programmer programmer1 =new Programmer();
        Programmer programmer2= new Programmer();


        /**
         * programmer1: define the states
         * age = 30
         * name=Filippo
         * wearsGlasses= yes
         */
        programmer1.age=30;
        programmer1.name="Filippo";
        programmer1.wearsGlasses=true;

        /**
         * programmer2: define the states
         * age = 22
         * name=Anna
         * wearsGlasses= no
         */

        programmer2.wearsGlasses=false;
        programmer2.name="Anna";
        programmer2.age=22;

        programmer1.drinkCoffe();
        programmer1.printDetails();

        programmer2.printDetails();
        programmer2.hasGlasses();


    }
}
