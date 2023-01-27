// QUESTION 3 Grading System (Student 3 Subject Marks ) Total Marks, Percentage , Grade e.g >=90 A Grade , <90 to 70 B Grade , <70 to 60 C Grade , 60< to 50 D Grade, Otherwise F Grade
import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner I=new Scanner(System.in);
        System.out.print("Enter 1st subject marks--:");
        int m1=I.nextInt();
        System.out.print("\nEnter 2st subject marks--:");
        int m2=I.nextInt();
        System.out.print("\nEnter 3st subject marks--:");
        int m3=I.nextInt();
        double percentage=(m1+m2+m3)*100/300;
        if((int)percentage>=90)
        System.out.println("Your grade is A");
        else if((int)percentage>=70 && (int)percentage<90)
        System.out.println("Your grade is B");
        else if((int)percentage>=60 && (int)percentage<70)
        System.out.println("Your grade is C");
        else if((int)percentage>=50 && (int)percentage<60)
        System.out.println("Your grade is D");
        else
        System.out.println("Your grade is F");
        I.close();
    }
}
