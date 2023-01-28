// 4. ArmStrong Number e.g 153 1 ^3 + 5 ^ 3 + 3 ^3 = 153
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int dub=num;
        int rep=num;
        int count=0;
        int sum=0;
        while(dub!=0){
            count++;
            dub/=10;
        }
        while(num!=0)
        {
            sum+=Math.pow(num%10, count);
            num/=10;
        }
        if(sum==rep)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not a Armstrong Number");
        
    }
}
