/**
 * This class is used to create instances of ClassA and ClassB
 * @author Syed Zayed Omar
 * @email: syed.omar@ucalgary.ca
 * @version 21.0.1
 * @UCID: 30206798
 */

import java.util.Scanner;   // Import the Scanner class

public class Main {
    public static void main(String[] args) {

        Scanner A1 = new Scanner(System.in);  // Create a Scanner object
        int x1; // This sets up the x value of ClassA
        while(true) { // This loop keeps repeating until the user inputs a valid input, in which case the loop is broken
            try {
                System.out.println("What do you want to assign for the x value in ClassA?"); // Asks user to input x value for ClassA
                x1 = Integer.parseInt(A1.nextLine()); // stores the user input in x1
                break; // this line breaks the loop if the input can be parsed
            } catch (Exception e) { // catches invalid inputs
                System.out.println("Your input is not valid, please try again.\n"); // A string is printed which tells the user that the input is invalid, and the while loop repeats
            }
        }

        Scanner A2 = new Scanner(System.in);  // Create a Scanner object
        int y1; // This sets up the y value of ClassA
        while(true) { // This loop keeps repeating until the user inputs a valid input, in which case the loop is broken
            try {
                System.out.println("What do you want to assign for the y value in ClassA?"); // Asks user to input y value for ClassA
                y1 = Integer.parseInt(A2.nextLine()); // stores the user input in y1
                break; // this line breaks the loop if the input can be parsed
            } catch (Exception e) { // catches invalid inputs
                System.out.println("Your input is not valid, please try again.\n"); // A string is printed which tells the user that the input is invalid, and the while loop repeats
            }
        }

        ClassA v1 = new ClassA(x1, y1); // Create an instance of ClassA with assigned values
        System.out.println("ClassA x value: " + v1.x + "\n" + "ClassA y value: " + v1.y + "\n"); // Print the x and y values of ClassA


        Scanner B1 = new Scanner(System.in);  // Create a Scanner object
        int x2; // This sets up the x value of ClassB
        while(true) { // This loop keeps repeating until the user inputs a valid input, in which case the loop is broken
            try {
                System.out.println("What do you want to assign for the x value in ClassB?"); // Asks user to input x value for ClassB
                x2 = Integer.parseInt(B1.nextLine()); // stores the user input in x2
                break; // this line breaks the loop if the input can be parsed
            } catch (Exception e) { // catches invalid inputs
                System.out.println("Your input is not valid, please try again.\n"); // A string is printed which tells the user that the input is invalid, and the while loop repeats
            }
        }

        Scanner B2 = new Scanner(System.in);  // Create a Scanner object
        int y2; // This sets up the y value of ClassB
        while(true) { // This loop keeps repeating until the user inputs a valid input, in which case the loop is broken
            try {
                System.out.println("What do you want to assign for the y value in ClassB?"); // Asks user to input y value for ClassB
                y2 = Integer.parseInt(B2.nextLine()); // stores the user input in y2
                break; // this line breaks the loop if the input can be parsed
            } catch (Exception e) { // catches invalid inputs
                System.out.println("Your input is not valid, please try again.\n"); // A string is printed which tells the user that the input is invalid, and the while loop repeats
            }
        }

        ClassB v2 = new ClassB(x2, y2); // Create an instance of ClassB with assigned values
        System.out.println("ClassB x value: " + v2.x + "\n" + "ClassB y value: " + v2.y + "\n");// Print the x and y values of ClassB
    }
}




















