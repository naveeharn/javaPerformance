package javaTutorialBeginner.project40_copyObj;

public class Car {
    private String make;
    private String model;
    private int year;
    
    public Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    Car(Car car){
        this.copyObj(car);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void copyObj(Car car) {
        this.setMake(car.make);
        this.setModel(car.model);
        this.setYear(car.year);
    }

    // public String toString() {
    //     return make+" "+model+" "+year+"\n";
    // }

}
