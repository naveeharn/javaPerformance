package javaTutorialBeginner.project40_copyObj;

public class project40_copyObj {
    public static void main(String[] args) {
        
        Car listCar[] = new Car[10];

        listCar[0] = new Car("Benz", "G250", 2019);
        listCar[1] = new Car("lykan", "hypersport", 2019);

        System.out.println(listCar[0]);
        System.out.println(listCar[1]);
        System.out.println(listCar[1].getMake());

        listCar[2] = listCar[0];
        System.out.println(listCar[2]);

        listCar[2].copyObj(listCar[1]);
        System.out.println(listCar[2]);

        listCar[3] = new Car(listCar[1]);
        System.out.println(listCar[3]);
        System.out.println(listCar[3].getMake());

        listCar[4] = new Car("tesla", "s", 2020);


    }
}
