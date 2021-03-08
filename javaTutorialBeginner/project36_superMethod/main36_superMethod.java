package javaTutorialBeginner.project36_superMethod;

public class main36_superMethod {

    /**
     * super
     * keyword refers to te superclass (palrent) of an oject
     * very similar ti=o the "this" keyword
     * @param args
     */

    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Bat Man",42,"$$$");
        Person person1 = new Person("Elon Must", 44);

        System.out.println(hero1.name + hero1.age + hero1.power);
        System.out.println(person1.name + person1.age);
        System.out.println(person1.toString());
        System.out.println(hero1.toString());
    }
}
