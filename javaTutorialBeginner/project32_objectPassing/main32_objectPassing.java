package javaTutorialBeginner.project32_objectPassing;

public class main32_objectPassing {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car_01 = new Car("BMW");
        Car car_02 = new Car("Tesla");

        garage.park(car_01);
        garage.park(car_02);

        System.out.println();
    }
}
