/*Q1.Compute Simple Interest , Take Principle
,ROI and Time as an Input from Scanner or Command Line Argument.   */  
    import java.util.Scanner;
    public class SimpleInterst{
        public static void main(String[] args) {
            Scanner I=new Scanner(System.in);
            System.out.print("Enter you principle-: ");
            int principle=I.nextInt();
            System.out.print("\nEnter you rate of interst-: ");
            int roi=I.nextInt();
            System.out.print("\nEnter the time-: ");
            int time=I.nextInt();
            int simpleinterst=(principle*time*roi)/100;
            System.out.println("\nThe Simple interst is-:"+simpleinterst);
            I.close();
        }
    }