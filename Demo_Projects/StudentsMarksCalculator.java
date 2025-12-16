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
        
        //pass fail per subject 
        String mathResult = (math>=35) ? "Pass" : "Fail";
        String scienceResult = (science>=35) ? "Pass" : "Fail";
        String historyResult = (history>=35) ? "Pass" : "Fail";
        String geographyResult = (geography>=35) ? "Pass" : "Fail";
        String computerResult = (computer>=35) ? "Pass" : "Fail";

        String overallResult;
         if (math < 40 || science < 40 || history < 40 || geography < 40 || computer < 40) {
            overallResult = "FAIL";
        } else {
            overallResult = "PASS";
        }


        String grade;
        if (overallResult.equals("FAIL")) {
            grade = "N/A";
       } else if (Percentage >= 90) {
            grade = "A+";
        } else if (Percentage >= 75) {
            grade = "A";
        } else if (Percentage >= 60) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println("\n------ Student Result -------");
        System.out.println("Name        :"+name);

        System.out.println("\nSubject-wise Result:");
        System.out.println("Math       : " + math + " - " + mathResult);
        System.out.println("Science    : " + science + " - " + scienceResult);
        System.out.println("History    : " + history + " - " + historyResult);
        System.out.println("Computer   : " + computer + " - " + computerResult);
        System.out.println("geography     : " + geography + " - " + geographyResult);


         System.out.println("\nTotal Marks: " + Total + "/500");
        System.out.println("Percentage : " + Percentage + "%");
        System.out.println("Result     : " + overallResult);
        System.out.println("Grade      : " + grade);

        sc.close();




    }
    
}
