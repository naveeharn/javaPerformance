package javaTutorialBeginner;

import java.lang.reflect.Array;
import java.sql.Time;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

// import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;

public class Main {
    public static void main(String[] args) {
        // 1 beginner 070121
        /*
         * System.out.println("\\ //"); System.out.println("Main.main()");
         */

        // 2 variable
        /*
         * int x; //declaration x = 123; //assignment int y= 4; //initialization
         * 
         * System.out.println(x+" "+y);
         * 
         * long l=12345678901234L; byte b = 1;
         * 
         * float f = 3.14f; double d = 3.14;
         * 
         * boolean z = true;
         * 
         * char symbol = '@'; String text = "java";
         * 
         * System.out.println(text+"\n" + d + f + l);
         */

        // 3 swap
        /*
         * String string_1 = "water"; String string_2 = "cool aid"; String temp; temp =
         * string_1; string_1=string_2; string_2=temp;
         * System.out.println("swap :"+string_1+"\t"+string_2);
         */
        // 4 input variable
        /*
         * 
         * Scanner scanner = new Scanner(System.in);
         * 
         * System.out.print("Text\t : \t"); String name = scanner.next();
         * 
         * System.out.print("Number\t : \t"); int number = scanner.nextInt();
         * 
         * System.out.print("araiwa " + name); System.out.println(" :: number " +
         * number);
         */
        // 5 expression
        /*
         * // + - * /
         */
        // 6 GUI
        /*
         * 
         * // JOptionPane.showMessageDialog(parentComponent, message, title,
         * messageType); // JOptionPane.showMessageDialog(parentComponent, message);
         * 
         * JOptionPane.showMessageDialog(null, "doubleHee");
         * 
         * String name = JOptionPane.showInputDialog("Enter message ::", "message");
         * 
         * JOptionPane.showMessageDialog(null, "your message :: \n" + name);
         * 
         * int integer =
         * Integer.parseInt(JOptionPane.showInputDialog("parentComponent"));
         * JOptionPane.showMessageDialog(null, "your number :: \n" + integer);
         * 
         * double realNumber =
         * Double.parseDouble(JOptionPane.showInputDialog("parentComponent"));
         * JOptionPane.showMessageDialog(null, "your realNumber :: \n" + realNumber);
         * 
         * System.out.println(name); System.out.println(integer);
         * System.out.println(realNumber);
         */
        // 7 Java Math Class
        /*
         * 
         * // double x = 3.41; // double y = 9.81; // double max = Math.max(x, y); //
         * double min = Math.min(x, y); // JOptionPane.showMessageDialog(null
         * ,"max value : "+ max + "\nmin value : "+ min);
         * 
         * Scanner scanner = new Scanner(System.in); // double a=0,b=0; // a =
         * scanner.nextDouble(); // b = scanner.nextDouble();
         * 
         * double a =Double.parseDouble(JOptionPane.showInputDialog("Enter a :: "));
         * double b =Double.parseDouble(JOptionPane.showInputDialog("Enter b :: "));
         * JOptionPane.showMessageDialog(null ,"pytagorus c : " + Math.sqrt(Math.pow(a,
         * 2) + Math.pow(b, 2) ));
         */
        // 8 Random Number 080121
        /*
         * 
         * Random random = new Random(); int x = random.nextInt(10); double y =
         * random.nextDouble(); boolean z = random.nextBoolean(); //
         * JOptionPane.showMessageDialog(null, "random 1 to 10 :: " + x);
         * System.out.println(x); for(int i=0;i<9;i++){ x = random.nextInt(10); y =
         * random.nextDouble(); System.out.println(x+" "+y); }
         */
        // 9 IF statements
        /*
         * int age = 10 ; Scanner scanner = new Scanner(System.in);
         * System.out.print("Enter your age :: "); int x = scanner.nextInt(); if (x>=18)
         * { System.out.println("Adult"); }else{ System.out.println("too Young"); }
         */
        // 10 Switch
        /*
         * String day = "Friday"; switch (day) { case "Monday" :
         * System.out.println(":: Yellow"); break; case "Tuesday" :
         * System.out.println(":: Pink"); break; case "Wednesday" :
         * System.out.println(":: i dont know"); break; case "Thursday" :
         * System.out.println(":: Orange"); break; case "Friday" :
         * System.out.println(":: Blue"); break; default:
         * System.out.println(":; N O P E"); break; }
         */
        // 11 Logical Operators 100121
        /*
         * int temp = 25 ; if (temp > 30) { System.out.println("hot"); } else if(temp >=
         * 20 && temp<= 30){ System.out.println("warm"); } else {
         * System.out.println("cold"); }
         * 
         * Scanner scanner = new Scanner(System.in); String res = scanner.next(); if
         * (res.equals("q") || res.equals("Q")) { System.out.println("exit :;"); } else
         * { System.out.println("yeah yeah ::"); }
         */
        // 12 while Loop
        /*
         * boolean check = false ; while (name.isBlank()) { if (check)
         * System.out.println("you aren't input name");
         * System.out.print("Enter your name : "); name = scanner.nextLine(); check =
         * true; } System.out.println("welcome user : " + name);
         */
        // 13 for Loop
    /*    
        LocalTime myDate = LocalTime.now();
        Time time;
        int temp = 5;
        // Scanner scanner= new Scanner(System.in);
        // String name = "";
        for (int i = temp; i > 0; i--) {
            System.out.println(i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(null, "Time Up");
    * */
        //14 Nested Loop 
    /*
        Scanner scanner = new Scanner(System.in);
        int row, column ;
        System.out.print("Enter number of row       : "); 
        row = scanner.nextInt();
        System.out.print("Enter number of column    : "); 
        column = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("("+i+","+j+") ");
            }System.out.println("");
        }
    * */
        //15 1D Arrays 
    
        // String[] cars = {"ToyoTU","XiaO","Tessa"};
        String[] cars = new String[3];
        cars[0] = "ToyoTU";
        cars[1] = "XiaO";
        cars[2] = "Tessa";
        JOptionPane.showMessageDialog(null, cars);
        cars[0] = "Lykan";
        for (String string : cars) {
            System.out.println(string);
        }
        JOptionPane.showMessageDialog(null, cars);
    
        //16 2D Arrays
    /*
        String[][] cars = new String[3][3];

        cars[0][0] = "Lykan"; 
        cars[0][1] = "Lamboghini";
        cars[0][2] = "Benz";
        cars[1][0] = "BMW";
        cars[1][1] = "Tesla";
        cars[1][2] = "Audi";
        cars[2][0] = "Honda";
        cars[2][1] = "Mitsubishi";
        cars[2][2] = "Ferrari";
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }
    * */
        //17 String Method
    /*
        String name = "Bro";
        boolean result = name.equalsIgnoreCase("bro");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("o");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        //String result = name.replace('o', 'a');
        System.out.println(result);
    * */
        //18 wrapper classes    13/01/21
    /*
        Boolean a = true;
        Character b = '@';
        Integer c = 112;
        Double d = 3.14;
        String e = "doubleHee";
        // a=false;
        if (b=='@') {
            JOptionPane.showMessageDialog(null, "True");
        }
    * */
        //19 ArrayList 
    /*    
        // in < > use Wrapper Classes not Primitive Type.
        ArrayList<String> food = new ArrayList<String>();
        food.add("Ham");
        food.add("HotDog");
        food.add("Beef");

        food.set(0, "newElement");
        food.remove(2);
        for (int i = 0; i < food.size(); i++) {
            System.out.print(food.get(i)+" ");
        }
        System.out.println();
        food.clear();
        food.add("teaPOT");
        for (String string : food) {
            System.out.println(string);
        }    
    * */
        //20 2D ArrayList
    /*    
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("donuts");

        ArrayList<String> productList = new ArrayList();
        productList.add("tomato");
        productList.add("zucchini");
        productList.add("peppers");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("soda");
        drinkList.add("coffee"); 
        drinkList.add("vodka");

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinkList);

        System.out.println(drinkList+" "+productList);
        System.out.println(groceryList);
        System.out.println(groceryList.get(1).get(1));
    
    * */
        //21 for-each
    /*    
        // ArrayList<String> animals = new ArrayList<String>();
        // animals.add("cat");
        // animals.add("dog");
        // animals.add("bird");

        String[] animals = {"cat","dog","bird"};
        for (String i : animals) {
            System.out.println(i);
        }
    * */
        //22 Java Methods
    /*
        Scanner scanner = new Scanner(System.in);
        // String name = scanner.next();
        // int number = scanner.nextInt();
        // method(name,number);
        // method("name",112);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(pow(x, y));
    * */
        //23 Overload Method
        /*
        * */
        //
        /*
        * */
        //
        /*
        * */
        //
        /*
        * */
        //
        /*
        * */
        //
        /*
        * */
        //
        /*
        * */

    }

        // 22 Java Methods
    /*
        // static void method(String name, int number) {
        //         System.out.println("Hello "+name + "Number " + number);
        //     }

        static int pow(int x, int y){
            int z=1;
            for (int i = 0; i < y; i++) {
                z*=x;
            }
            return z;
        }
    * */
    
}

