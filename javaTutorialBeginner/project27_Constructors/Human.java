package javaTutorialBeginner.project27_Constructors;

public class Human {

    String name;
    int age;
    double weight;
    
    Human(String name, int age ,double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        System.out.println(this.name + " is eatting");
    }

    public void drink() {
        System.out.println(this.name + " is drinking *Bruh*");
    }

}
