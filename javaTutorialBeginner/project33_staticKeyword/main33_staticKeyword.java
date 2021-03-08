package javaTutorialBeginner.project33_staticKeyword;

public class main33_staticKeyword {
    public static void main(String[] args) {
        /**
         *  static
         *  modifier. A single copy of a variable/method is create and shared.
         *  The class "owns" the static member.
         */

        Friend freand_01 = new Friend("Jeff");
        Friend freand_02 = new Friend("Cena");
        Friend freand_03 = new Friend("Daeng");
        Friend freand_04 = new Friend("Abe");

        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
        
    }
}
