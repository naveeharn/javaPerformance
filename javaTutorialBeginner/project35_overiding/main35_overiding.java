package javaTutorialBeginner.project35_overiding;

public class main35_overiding {
    public static void main(String[] args) {
        /**
         *  Method Overiding
         *  Declaring a method in sub class
         *  whitch is already present in parent class
         *  done so that a child class can give its own implemention
         */

        Animal animal = new Animal();
        Dog boh = new Dog();

        animal.speak();
        boh.speak();
        
        System.out.println();
    }
}
