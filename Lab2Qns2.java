import java.util.Scanner;

public class Lab2Qns2 {
    public static void main(String[] args){

        double[] numbers = new double[3];
        double accumulator = 0, average = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        for(int i=0; i<numbers.length;i++){
            numbers[i] = input.nextDouble();
            accumulator += numbers[i];
        }
        
        average = accumulator/3;
        System.out.println("The average of " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " is " + average);
        
        input.close();
    }
}
