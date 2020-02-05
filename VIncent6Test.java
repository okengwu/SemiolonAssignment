import java.util.Scanner;
class Vincent6Test{
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            Vincent6 gradebookObject = new Vincent6();

            System.out.println("enter the course name");
            String courseName = input.nextLine();

            gradebookObject.displayMessage(courseName);
            
        }
    }