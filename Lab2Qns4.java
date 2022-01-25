import java.util.Scanner;

public class Lab2Qns4 {
    public static void main(String [] args){
        
        int value = 0;
        
        String[] zodiac = {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        value = (input.nextInt())%12;
        System.out.println(zodiac[value]);

        input.close();
    }
}