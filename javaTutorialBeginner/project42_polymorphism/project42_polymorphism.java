package javaTutorialBeginner.project42_polymorphism;

public class project42_polymorphism {
    /**
     * polymorphism
     * 
     * greek word fpr poly-"many" , morph-"form"
     * The ability of an object to identity as more than one type
     */
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        Vehicle vehicle1 = new Vehicle();

        //superclass        //subclass extends Vehicle
        Vehicle[] racers = {car,bicycle,boat,vehicle1};

        car.go();
        bicycle.go();
        boat.go();
        

        for (Vehicle vehicle : racers) {
            vehicle.go();
        }

    }
}
