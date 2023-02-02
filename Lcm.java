// 4.LCM of a Number
public class Lcm {
   public static void main(String[] args) {
    int a=20,b=40;
    int gcd=0;
        // Finding the greatest common divisor or HCF
            while(a%b!=0){
                 gcd=a%b;
                 a=b;
                 b=gcd;
            }
            // LCM*GCD=a*b
            System.out.println("Lcm is-:"+(a*b)/gcd);
   } 
}
