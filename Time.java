import java.util.Scanner;
public class Time {

        private String courseName; // name of course this GradeBook represents
        
        private int total; // sum of grades
        private int gradeCounter; // number of grades entered
        private int aCount; // count of A grades
        private int bCount; // count of B grades
        private int cCount; // count of C grades
        private int dCount; // count of D grades
        private int fCount; // count of F grades
       
       
         public Time( String name )
         {
        courseName = name; // initializes courseName
     } // end constructor
        
        // method to set the course name
         public void setCourseName( String name )
         {
         courseName = name; // store the course name
         } // end method setCourseName
        
         // method to retrieve the course name
         public String getCourseName() {
             return courseName;
         }
     
       public void displayMesasage() {
           System.out.printf("welcome to the grade book for\n%s!\n\n", 
           getCourseName());
       }     
       public void inputGrade(){
           Scanner input = new Scanner(System.in);
           int grade;
           System.out.printf( "%s\n%s\n %s\n %s\n",
            "Enter the integer grades in the range 0-100.",
            "Type the end-of-file indicator to terminate input:",
           "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
            "On Windows type <Ctrl> z then press Enter" );
      
                while(input.hasNext()){
                    grade = input.nextInt();
                    total += grade;
                    ++gradeCounter;

                    incrementLetterGradeCounter(grade);
                }
        }
       
            private void incrementLetterGradeCounter(int grade){
               
{           
                        switch ( grade / 10 ){ 
                    case 9: // grade was between 90
                    case 10: // and 100, inclusive
                     ++aCount; // increment aCount
                    break; // necessary to exit switch
                    case 8: // grade was between 80 and 89
                    ++bCount; // increment bCount
                    break; // exit switch
                    case 7: // grade was between 70 and 79
                    ++cCount; // increment cCount
                    break; // exit switch
                    case 6: // grade was between 60 and 69
                    ++dCount; // increment dCount
                    break; // exit switch
                    default: // grade was less than 60
                    ++fCount; // increment fCount
                    break; // optional; will exit switch anyway
                    } 
                }
            }
                // display a report based on the grades entered by the user
 public void displayGradeReport()
 {
 System.out.println( "\nGrade Report:" );

 
 if ( gradeCounter != 0 )
 {
 // calculate average of all grades entered
 double average = (double) total / gradeCounter;

     // output summary of results
     System.out.printf( "Total of the %d grades entered is %d\n",
     gradeCounter, total );
     System.out.printf( "Class average is %.2f\n", average );
     System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
    "Number of students who received each grade:",
     "A: ", aCount, // display number of A grades
     "B: ", bCount, // display number of B grades
     "C: ", cCount, // display number of C grades
    "D: ", dCount, // display number of D grades
    "F: ", fCount ); // display number of F grades
 } // end if
 else // no grades were entered, so output appropriate message
 System.out.println( "No grades were entered" );
 } 
}
 