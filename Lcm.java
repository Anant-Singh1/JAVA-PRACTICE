// 3.LCM of a Number
public class Lcm {
   public static void main(String[] args) {
    int a=20,b=40;
    int gcd=1;
        // Finding the greatest common divisor
            for (int i = 1; i <=a && i<=b; i++) {
                if(a%i==0 && b%i==0)
                gcd=i;
            }
            // LCM*GCD=a*b
            System.out.println("Lcm is-:"+(a*b)/gcd);
   } 
}
