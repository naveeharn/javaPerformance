package javaTutorialBeginner.project37_abstraction;

public abstract class Vehicle {
    double speed;
    
    Vehicle(){

    }

    abstract void go();

    // public void go() {
    //     System.out.println("This vechicle is moving.");
    // }

    public void stop() {
        System.out.println("This vechicle is stopped.");
    }
}

