package javaTutorialBeginner.project39_encapsulation;

public class Car {

    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // public Car(String make, String model, int year) {
    //     this.setMake(make);
    //     this.setModel(model);
    //     this.setYear(year);
    // }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    

    public String toString() {
        return make+" "+model+" "+year;
    }

    

}
