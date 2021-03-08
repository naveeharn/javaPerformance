package javaTutorialBeginner.project28_variableScope;

import java.util.Random;

public class customDiceRoller {

    //globalVariable

    int number;
    Random random;
    
    customDiceRoller(){
        random = new Random();
        number = 0;
        // this.random = new Random();
        // this.number = 0;
        roll();
    }

    public void roll() {
        number = random.nextInt(6)+1;
        System.out.println(random.nextInt(6)+1);
    }
}
