package javaTutorialBeginner.project27_Constructors;

public class main27_Constructors {
    public static void main(String[] args) { 
        //180121
        Human human01 = new Human("Rook", 65, 78.3);
        Human human02 = new Human("Jeff", 31, 82.5);

        System.out.println(human01.name);
        human02.eat();
        human01.drink();
    }

}
