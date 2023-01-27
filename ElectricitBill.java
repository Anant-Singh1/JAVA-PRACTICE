// QUESTION 5-Electricity Bill, Based on Given Unit  e.g Upto 199 Units Per unit Charge @1.20 , 200 to 400 @1.50 Unit 400 to 600 Bill @1.80 , > 600 @2.00 , if bill Exceed Rs 400 Surcharge 15% 
import java.util.Scanner;
public class ElectricitBill {
    public static void main(String[] args) {
        Scanner I=new Scanner(System.in);
        System.out.print("Enter the consumed unit-:");
        int unit=I.nextInt();
        double amt=0,surcharge=0;
        // boolean un;
        if(unit<200)
        amt=unit*1.20;
        else if(unit>=200 && unit<400)
        amt=199*1.20+(unit-199)*1.50;
        else if(unit>=400 && unit < 600)
        amt=199*1.20+200*1.50 +(unit-399)*1.80;
        else
        amt=199*1.20+200*1.50 +200*1.80+(unit-599)*2.0;

        if(amt>400)
        surcharge=amt*0.15;
        System.out.println("The Net amount is-: Rs "+(float)(amt+surcharge));
        I.close();
    }
}
