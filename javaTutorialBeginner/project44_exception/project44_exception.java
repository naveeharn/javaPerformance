package javaTutorialBeginner.project44_exception;

import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class project44_exception {
    public static void main(String[] args) {
        /**
         * exception
         * 
         * an event occurs during the execution of a program that, disrupts the normal
         * flow of instructions
         */
        Scanner scanner = new Scanner(System.in);
        try (BufferedReader br = null) {
            System.out.print("Enter a whole number to devide : ");
            int x = scanner.nextInt();
            System.out.print("Enter a whole number to devide by : ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result x/y = " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero IDiOT!");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number !");
        } catch (Exception e) {
            System.out.println("Something when wrong");
        } finally {
            System.out.println("This will always print");
            scanner.close();
        }

    }
}
