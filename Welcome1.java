// fig. 2.1: Welcome1.java
// test-printing program.
import java.util.Scanner;
/* shina bad boy in programming*/ 
public class Welcome1 {
    
public static void main(String[]args){
int passes = 0;
int failures = 0;
int studentCounter = 1;
int result;
Scanner input = new Scanner(System.in);
while (studentCounter <= 10){

    System.out.print("enter result (1 = pass. 2 = fail): ");
    result = input.nextInt();

    if(result != 1){ 
    System.out.print("enter result (1 = pass. 2 = fail): ");
    result = input.nextInt();
    }
    if (result == 1)
    passes = passes + 1;
    else 
    failures = failures + 1;
    
    studentCounter++;
}
System.out.printf("passed: %d\nfailed: %d\n", passes, failures);

         if(passes > 8)
       System.out.println("Bonus to instructor!");
}


}