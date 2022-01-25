import java.util.Scanner;

public class Lab2Qns1 {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        final double PI = 3.14159;
        double area = 0;

        System.out.print("Enter a number for radius: ");
        double radius = userInput.nextDouble();
        
        area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);

        userInput.close();
    }
}








