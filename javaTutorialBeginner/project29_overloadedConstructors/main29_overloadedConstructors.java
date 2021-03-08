package javaTutorialBeginner.project29_overloadedConstructors;

public class main29_overloadedConstructors {
    /**
     *  overload constructors
     *  multiple constructors within a class with te same name,
     *  but have different parameters
     *  name + parameters = signature
     */

    public static void main(String[] args) {
        
        Pizza order_01 = new Pizza("Thicc Crust","Tomato","Mozzerella","Pepperoni");

        Pizza order_02 = new Pizza("Thin", "Basil", "Parmesan");

        Pizza order_03 = new Pizza("Thicc", "Pesto");

        order_01.showList("order 01");
        order_02.showList("order 02");
        order_03.showList("order 03");

        // System.out.println(order_01.bread);
    }
}
