package javaTutorialBeginner.project26_OOP;

public class main26_OOP {

    public static void main(String[] args) {
        class26_Car myCar = new class26_Car();
        class26_Car myVan = new class26_Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);

        System.out.println(myVan.make);
        System.out.println(myVan.model);

        myCar.drive();
        myCar.brake();
        
        myVan.drive();
        myVan.brake();
    }
    
}
