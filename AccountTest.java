import java.util.Scanner;
public class AccountTest{
    public static void main(String[] args){
        int count;
        for(count = 1; count <= 10; count++)
        {
            if(count == 5)
            break;
            System.out.printf("%d",count);
        }
        System.out.printf("%n%d%n",count);
    }
}