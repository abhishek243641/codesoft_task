import java.util.Scanner;

import static java.lang.System.exit;

public class student_grade_calculator {
    public static void main(String[] args) {

        int maths = 0, physics, chemistry, hindi, english;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter maths number !");
        maths=sc.nextInt();
        if(maths>100)
        {
            System.out.println("pls enter a valid marks");
            exit(0);
        }

        System.out.println("Enter physics number !");
        physics = sc.nextInt();
        if(physics>100)
        {
            System.out.println("pls enter a valid marks");
            exit(0);
        }
        System.out.println("Enter chemistry number !");
        chemistry = sc.nextInt();
        if(chemistry>100)
        {
            System.out.println("pls enter a valid marks");
            exit(0);
        }
        System.out.println("Enter hindi number !");
        hindi = sc.nextInt();
        if(hindi>100)
        {
            System.out.println("pls enter a valid marks");
            exit(0);
        }
        System.out.println("Enter english number !");
        english = sc.nextInt();
        if(english>100)
        {
            System.out.println("pls enter a valid marks");
            exit(0);
        }

        int total_marks = maths + physics + chemistry + hindi + english;

        System.out.println("Total marks=\t" +total_marks);
        double percentage =( total_marks / 500.0) * 100;
        System.out.println("Percentage=\t" +percentage);
        if (percentage >= 80) {
            System.out.println("Grade A");
        } else if (percentage < 80 || percentage >= 60) {
            System.out.println("Grade B");
        } else if (percentage < 60 || percentage >= 40) {
            System.out.println("Grade C");
        } else if (percentage < 40) {
            System.out.println("Grade D");
        }

    }

}


