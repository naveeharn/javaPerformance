package javaTutorialBeginner;

public class main23_overloadMethod {
    
    public static void main(String[] args) {
        //150121
        int i;
        i = add(1, 2);
        System.out.println(i);
        i = add(1, 2, 3);
        System.out.println(i);

        // float f;
        // f = add(1, 0.2);
        // f = add(1.1, 2.3);
        
        double d;
        d = add(1, 1.2);
        System.out.println(d);
        d = add(1.2, 3);
        System.out.println(d);
    }

    public static int add(int a, int b) {
        System.out.println("int a, int b");
        return a+b;
    }
    public static int add(int a, int b, int c) {
        System.out.println("int a, int b, int c");
        return a+b+c;
    }
    // :: float can't use
    // public static float add(float a, float b) {
    //     System.out.println("float a, float b");
    //     return a+b;
    // }
    public static double add(int a, double b) {
        System.out.println("int a, float b");
        return a+b;
    }
    public static double add(double a, int b) {
        System.out.println("int a, float b");
        return a+b;
    }
    
}
