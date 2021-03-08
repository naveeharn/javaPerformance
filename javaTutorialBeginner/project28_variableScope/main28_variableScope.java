package javaTutorialBeginner.project28_variableScope;

import java.util.ArrayList;

public class main28_variableScope {
    public static void main(String[] args) {

        /**
         * local    declare inside a method 
         *          visible only to that method
         * global   declare outside a method, but within a class
         *          visible to all parts of a class
         */

        //local
        DiceRoller diceRoller = new DiceRoller();
        //global
        customDiceRoller customDiceRoller = new customDiceRoller();
    }
}
