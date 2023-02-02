// 2. Find out Prime Number
public class PrimeOptimized {
    public static void main(String[] args) {
        int num=128;
        if(num==1)
        {
            System.out.println("PRIME");
            return;
        }
        if(num==2 || num==3){
            System.out.println("PRIME");
            return;
        }
        if(num%2==0 || num%3==0){
            System.out.println("NOT PRIME");
            return;
        }
        for(int i=5;i*i<=num;i+=6){
if(num%i==0 || num%(i+2)==0){
    System.out.println("PRIME");
    return;
}
}
System.out.println("PRIME");

    }
}
