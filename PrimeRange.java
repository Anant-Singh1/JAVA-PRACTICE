// 8. WAP to find the Prime Number b/w 1 to N
import java.util.*;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner I=new Scanner(System.in);
        System.out.println("Enter the starting number");
        int a=I.nextInt();
        System.out.println("Enter the ending number");
        int b=I.nextInt();
        for (int i = a; i <=b; i++) {
            int count=0;
            for (int j = 1; j <=i; j++) {
                if(i%j==0)
                count++;
            }
            if(count==2)
            System.out.println(i);
        }
        I.close();
    }
}