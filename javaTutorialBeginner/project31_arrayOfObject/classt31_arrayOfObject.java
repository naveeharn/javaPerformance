package javaTutorialBeginner.project31_arrayOfObject;

public class classt31_arrayOfObject {
    public static void main(String[] args) {

        // Food[] listFood = new Food[3];

        Food food_01 = new Food("Pizza");
        Food food_02 = new Food("Hamburger");
        Food food_03 = new Food("Hotdog");


        Food[] listFood = {food_01,food_02,food_03};

        // listFood[0] = food_01;
        // listFood[1] = food_02;
        // listFood[2] = food_03;
        

        System.out.println(listFood[0].name);
    }
}
