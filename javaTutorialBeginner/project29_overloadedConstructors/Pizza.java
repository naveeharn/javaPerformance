package javaTutorialBeginner.project29_overloadedConstructors;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese, String topping) {

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }

    Pizza(String bread, String sauce, String cheese) {

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;

    }

    Pizza(String bread, String sauce) {

        this.bread = bread;
        this.sauce = sauce;

    }

    public void showList(String order) {
        System.out.println("Here are the ingredients of " + order + " :");
        if(bread != null)   System.out.println(bread);
        if(sauce != null)   System.out.println(sauce);
        if(cheese != null)  System.out.println(cheese);
        if(topping != null) System.out.println(topping);
        System.out.println("= = = = =");
    }
}
