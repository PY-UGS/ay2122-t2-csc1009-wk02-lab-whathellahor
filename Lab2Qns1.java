import java.util.Scanner;

public class Lab2Qns1 {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter a byte value: ");
        byte byteValue = userInput.nextByte();
        System.out.print("Enter a short value: ");
        short shortValue = userInput.nextShort();
        System.out.print("Enter a int value: ");
        int intValue = userInput.nextInt();
        System.out.print("Enter a long value: ");
        long longValue = userInput.nextLong();
        System.out.print("Enter a float value: ");
        float floatValue = userInput.nextFloat();

        System.out.println("\nThe byte value: " + byteValue);
        System.out.println("The short value: " + shortValue);
        System.out.println("The int value: " + intValue);
        System.out.println("The long value: " + longValue);
        System.out.println("The float value: " + floatValue);

        final double PI = 3.14159;
        double area = 0;

        System.out.print("\n\nEnter a number for radius: ");
        double radius = userInput.nextDouble();
        
        area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);

        userInput.close();
    }
}








