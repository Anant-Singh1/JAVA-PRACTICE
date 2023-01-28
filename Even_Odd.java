// 2.  Sum of Digit (Sum of Even Places and Odd Places) and Print Both of Them
public class Even_Odd {
 public static void main(String[] args) {
    int evensum=0;
    int oddsum=0;
    int num=1234;
    boolean flag=true;
    while(num!=0){
        if(flag){
            evensum+=num%10;
            flag=false;
        }
        else{
            oddsum+=num%10;
            flag=true;
        }
        num/=10;
    }
    System.out.println("Even placed sum="+evensum);
    System.out.println("Odd placed sum="+oddsum);

 }
}
