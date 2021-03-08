package javaTutorialBeginner.project34_inheritance;

public class main34_inheritance {
    public static void main(String[] args) {
        /**
         *  Inheritance
         *  the process where one class acquires,
         *  the attributes and methods of another.
         */

        Car car = new Car();
        Bicycle bike = new Bicycle();

        car.go();
        bike.stop();
        
        System.out.println(car.speed);
        System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
