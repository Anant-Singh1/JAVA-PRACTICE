// 5. Implement a program to find out whether a number is divisible by the sum of its digits. 
// Display appropriate messages.
// e.g 2250 - Yes
// e.g 123 - NO
public class SumDigitDiv {
 public static void main(String[] args) {
    int num=202;
    int dub=num;
    int sum=0;
    while(dub!=0){
     sum+=(dub%10);
     dub/=10;
    }
    if(num%sum==0)
    System.out.println("Its Divisible");
    else
    System.out.println("Not Divisible");
 }   
}
