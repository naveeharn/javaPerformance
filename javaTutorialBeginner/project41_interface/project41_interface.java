package javaTutorialBeginner.project41_interface;

public class project41_interface {
    /**
     * Interface
     * 
     * a template that can be applied to a class.
     * similar to inheritance , but specifies what a class has/must do.
     * classes can apply more that one interface , inheritanceis limited to 1 super
     */

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        
        rabbit.flee();

        // hawk.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();
        
    }
    
}
