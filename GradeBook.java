import java.util.Scanner;
public class GradeBook{
 
    private String courseName; 
    private String lecturerName;
     
    public GradeBook(String name, String lectureName){
       courseName = name;
       lecturerName = lectureName;
    }
public void setCourseName(String name){
    this.courseName = name;
}
public String getCourseName() {
    return courseName;
}
public void setLectureName(String name){
    this.lecturerName = name;
}
public String getLectureName(){
    return lecturerName;
}
public String displayName(){
   System.out.printf("welcome to grade book for\n%s! this course is presented by: %s\n", getCourseName(),getLectureName()) ;

   return null;
}

public int getstudentGrade(){
    int total= 0;
    int gradeCounter = 0;
    int average=0;
    Scanner input = new Scanner(System.in);
    System.out.println("enter Grade 0r -1 t0 end");
    int grade = input.nextInt();
    while (grade  != -1){
        total = total + grade;
        gradeCounter++;   
        System.out.println("enter Grade 0r -1 t0 end");
        grade = input.nextInt();  
    }
 
    if(gradeCounter != -1){ 
    average = total/gradeCounter;
    System.out.printf("The total is: %d%nthe average is: %d%n", average,total);
    }
    else
        System.out.println("no grade attached");
        return average;
    }

public static void main(String [] args){
    GradeBook book1 = new GradeBook("vimcent", "okengwu");
    book1.getstudentGrade();

}
}



