package javaTutorialBeginner.project43_dynamicPolymorphism;

import java.util.Scanner;

public class project43_dynamicPolymorphism {
    public static void main(String[] args) {
        /**
         * polymorphism = many shape / form
         * dynamic = after complilation (during runtime)
         * 
         * corvette is a corvette, and a car, and a vehicle, and a object
         */
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What do you want? : ");
        System.out.println("Dog press 1 or Cat press 2");
        int choice = scanner.nextInt();

        if (choice==1) {
            animal = new Dog();
            animal.speak();
        } else if (choice==2){
            animal = new Cat();
            animal.speak();
        } else { 
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }
    }
}
        
