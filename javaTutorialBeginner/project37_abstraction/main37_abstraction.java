package javaTutorialBeginner.project37_abstraction;

public class main37_abstraction {
    public static void main(String[] args) {
        /**
         *  abstract
         *  abstract classes cannot be instantiated, but they can have a subclass
         *  abstract methods are declared without an implementation
         */

        // Vechicle vechicle = new Vechicle();
        Car car = new Car();

        car.go();
        
    }
}
