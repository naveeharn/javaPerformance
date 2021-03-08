package javaTutorialBeginner.project33_staticKeyword;

public class Friend {

    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    public static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
