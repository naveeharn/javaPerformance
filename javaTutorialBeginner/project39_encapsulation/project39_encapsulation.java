package javaTutorialBeginner.project39_encapsulation;

public class project39_encapsulation {
    /**
     * Encapsulation
     * 
     * attributes of a class will be hidden or private 
     * Can be accessd only through methods (getters & setters)
     * You should make attributes private 
     * if you don't have a reason to make them
     */
    public static void main(String[] args) {
        Car car_01 = new Car("BMW", "G250", 2019);
        System.out.println(car_01.getMake());
        System.out.println(car_01.toString());
    }
     
}
