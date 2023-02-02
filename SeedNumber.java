
// 6. Implement a program to find out whether a number is a seed of another number.
// A number X is said to be a seed of number Y if multiplying X by its every digit equates to Y.
// E.g.: 123 is a seed of 738 as 123*1*2*3 = 738
// e.g 123, 738 - Yes
// e.g 45,1000 - No
import java.util.Scanner;
public class SeedNumber {
 public static void main(String[] args) {
    Scanner I=new Scanner(System.in);
    System.out.print("Enter the first number-:");
    int x=I.nextInt();
    System.out.print("\nEnter the second number-:");
    int y=I.nextInt();
    int dub=x;
    // int checker=x;
    while(dub!=0){
        x*=(dub%10);
        dub/=10;
    }
    if(x==y)
    System.out.println("Its a seed Number");
    else
    System.out.println("Not a seed Number");
I.close();
 }   
}
