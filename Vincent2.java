// good morning omoge this is integar 
// and im super excited bro. by the way my name is vincent and code written 4/30/2019
import java.util.Scanner; // program uses class Scanner 

public class Vincent2 {
    // can we just stop this commenting
    public static void main(String[] args) {
        // im creating a scanner to obtain input
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();

        System.out.println("Enter three integer: ");
        int number3 = input.nextInt();
        
        int sum = number1 + number2 + number3;
        
        int substraction = number1 - number2 - number3;

        int multiplication = number1 * number2 * number3;
        
        int divide = number1 / number2 / number3;

        System.out.printf("Sum is %d%n", sum);
        System.out.println("substraction is: " + substraction);
        System.out.println("multiplication is: " + multiplication);
        System.out.println(" divide is: " + divide);
        
       

    } 
}