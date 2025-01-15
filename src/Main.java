import java.util.Scanner;   // Import the Scanner class

public class Main {
    public static void main(String[] args) {

        Scanner A1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What do you want to assign for the x value in ClassA?"); // Asks user to input x value for ClassA
        int x1 = Integer.parseInt(A1.nextLine());  // Read user input

        Scanner A2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What do you want to assign for the y value in ClassA?"); // Asks user to input y value for ClassA
        int y1 = Integer.parseInt(A2.nextLine());  // Read user input

        ClassA v1 = new ClassA(x1, y1); // Create an instance of ClassA with assigned values
        System.out.println("x value: " + v1.x + "\n" + "y value: " + v1.y + "\n"); // Print the x and y values of ClassA


        Scanner B1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What do you want to assign for the x value in ClassB?"); // Asks user to input x value for ClassB
        int x2 = Integer.parseInt(B1.nextLine());  // Read user input

        Scanner B2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What do you want to assign for the y value in ClassB?"); // Asks user to input y value for ClassB
        int y2 = Integer.parseInt(B2.nextLine());  // Read user input

        ClassB v2 = new ClassB(x2, y2); // Create an instance of ClassB with assigned values
        System.out.println("x value: " + v2.x + "\n" + "y value: " + v2.y + "\n");// Print the x and y values of ClassB



    }
}




















