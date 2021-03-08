package javaTutorialBeginner;

public class main24_printf {
    public static void main(String[] args) {
        System.out.printf("hello integer %d \n",12345);
        System.out.printf("hello float %f \n",12345.6789);
        System.out.printf("hello double %.2f \n",12345.6789);

        //print() % [flags][persition][width][conversation-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        String myString2 = "Bro123456789";
        int myInt = 112;
        double positiveDouble = 123000.456;
        double negativeDouble = -123000.456;

        //[conversation-character]
        System.out.printf("%b \n",myBoolean);
        System.out.printf("%c \n",myChar);
        System.out.printf("%s \n",myString);
        System.out.printf("%d \n",myInt);
        System.out.printf("%f \n",positiveDouble);

        //[width]
        System.out.printf("Hello %10s::\n",myString);
        System.out.printf("Hello %10s::\n",myString2);

        System.out.printf("Hello %-10s::\n",myString);
        System.out.printf("Hello %-10s::\n",myString2);

        //[precision]
        System.out.printf("You have this much money %f \n", positiveDouble);
        System.out.printf("You have this much money %.2f \n", positiveDouble);

        //[flags]
        System.out.printf("You have this much money %20f::\n", positiveDouble);
        System.out.printf("You have this much money %-20f::\n", positiveDouble);

        System.out.printf("You have this much money %+f::\n", positiveDouble);
        System.out.printf("You have this much money %+f::\n", negativeDouble);

        System.out.printf("You have this much money %020f::\n", positiveDouble);
        System.out.printf("You have this much money %020f::\n", negativeDouble);

        System.out.printf("You have this much money %,f::\n", positiveDouble);
        System.out.printf("You have this much money %,f::\n", negativeDouble);

    }
}
