package javaTutorialBeginner.project28_variableScope;

import java.util.Random;

public class DiceRoller {

    //localVariable

    DiceRoller(){
        Random random = new Random();
        int number = 0;
        roll(random,number);
    }

    public void roll(Random random, int number) {
        // number = random.nextInt(6)+1;
        System.out.println(random.nextInt(6)+1);
    }
}
