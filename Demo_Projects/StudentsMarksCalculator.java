package Demo_Projects;
import java.util.*;
public class StudentsMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name:");
        String name = sc.nextLine();

        int math, science, history, computer, geography;

        System.out.print("Enter Math Marks:");
        math = sc.nextInt();
         System.out.print("Enter Science Marks:");
        science = sc.nextInt();
         System.out.print("Enter History Marks:");
        history = sc.nextInt();
         System.out.print("Enter Geography Marks:");
        geography = sc.nextInt();
         System.out.print("Enter Computer Marks:");
        computer = sc.nextInt();

        int Total = math + science + history + geography + computer ;
        double Percentage = Total/(5.0);

        String grade;
        if(Percentage>=90){
              grade ="A+";
        }
        else if(Percentage>=75){
            grade = "A";
        }
        else if(Percentage>=65){
            grade = "B+";
        }
        else if(Percentage>=55){
            grade = "B+";
        }
        else if(Percentage>=35){
            grade = "C+";
        }
        else{
            grade = "Fail";
        }

        System.out.println("\n------ Student Result -------");
        System.out.println("Name        :"+name);
        System.out.println("Total Marks :"+Total+"/500");
        System.out.println("Percentage  :"+Percentage+"%");
        System.out.println("Grade       :"+grade);



    }
    
}
