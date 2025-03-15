package Daily_Java_Task_2025;
import java.util.Scanner;

public class Task_13Mar_Ternary_Operator {
    public static void main(String[] args) {

        //Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F) based on
        // the following grading scale:  -> calculate means checking score value not (+,-,)
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the score value:");
        int score = sc.nextInt();

        String result = (score >=90 && score<=100) ? "A=90-100" : (score>=80 && score <=89) ? "B=80-89" : (score>=70 && score <=79) ? "C=70-79" : (score>=60 && score <=69) ? "D=60-69" : (score>=0 && score <=59) ? "F=0-59" : "All Score Values are invalid";
        System.out.println(result);
    }
}
