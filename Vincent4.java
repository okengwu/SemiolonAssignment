// vincent, date- 4/30/2019
import java.util.Random;
import java.util.Scanner;


// this program will calculate three integer
public class Vincent4{
 
    public static void main(String[] args){

        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3= 0;
        int frequency4 = 0;
        int frequency5= 0;
        int frequency6 =0;

        Random randomNumbers = new Random();
        int face;

        for(int counter =1; counter <= 6000000; counter++){
            face = 1 + randomNumbers.nextInt(6);

      
             
            // if(counter % 5 == 0)
            // System.out.println();

            switch(face){
                case 1:
                ++frequency1;
                break;
                case 2:
                ++frequency2;
                break;
                case 3:
                ++frequency3;
                break;
                case 4:
                ++frequency4;
                break;
                case 5:
                ++frequency5;
                break;
                case 6:
                ++frequency6;
                break;
            }
        }
        System.out.println( "face\tfrequency\n");
        
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",frequency1,
        frequency2,frequency3,frequency4,frequency5,frequency6);
    }

}




  