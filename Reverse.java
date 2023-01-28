// 1.  Reverse a Number (Hint : % , *)
public class Reverse{
    public static void main(String[] args) {
        int num=1234;
        int sum=0;
        while(num!=0){
          sum=(sum*10)+(num%10);
          num/=10;
        }
        System.out.println(sum);
    }
}