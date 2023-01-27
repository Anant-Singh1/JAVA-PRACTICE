// QUESTION 1-->Hotel Menu System Design, We can order the Items and we get a Bill
import java.util.Scanner;
public class HotelMenu {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE HOTEL");
        System.out.println("PRESS THE FOLLOWING KEY TO ORDER YOUR FAVOURITE FODD");
        Scanner I=new Scanner(System.in);
        int totalbill=0;
        while(true){
            System.out.println("PRESS 1 for PIZZA(Amount-Rs900)");
            System.out.println("PRESS 2 for NOODLES(Amount-Rs499)");
            System.out.println("PRESS 3 for BURGER(Amount-Rs120)");
            System.out.println("PRESS 4 for CHICKEN WINGS(Amount-Rs720)");
            System.out.println("PRESS 5 for ICECREAM(Amount-Rs200)");
System.out.println("PRESS 6 to display BILL");
System.out.print("ENTER YOUR CHOICE-:");
int ch=I.nextInt();
switch(ch){
            case 1: System.out.println("\nThanks for ordering Pizza ");
             System.out.println();
             System.out.println();
             totalbill+=900;
             break;
             case 2: System.out.println("\nThanks for ordering Noodles");
             System.out.println();
             System.out.println();
             totalbill+=499;
             break;
             case 3: System.out.println("\nThanks for ordering Burger ");
             System.out.println();
             System.out.println();
             totalbill+=120;
             break;
             case 4: System.out.println("\nThanks for ordering Chicken Wings ");
             System.out.println();
             System.out.println();
             totalbill+=720;
             break;
             case 5: System.out.println("\nThanks for ordering Icecream ");
             System.out.println();
             System.out.println();
             totalbill+=200;
             break;
             case 6: System.out.print("\nYOUR TOTAL BILL GENERATED IS--:"+totalbill);
             System.out.println();
             System.out.println();
             System.exit(1);
             break;
             default:System.out.println("SORRY,BUT YOU ARE ENTERING A WRONG CHOICE..");
}

        }


    }
}
