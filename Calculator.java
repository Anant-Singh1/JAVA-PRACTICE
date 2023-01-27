// QUESTION 4-Build a Calc (Math Operations) Cube, Abs , Power, (Java Math Class) , Decimal to Binary , Binary to Decimal , Octal , Hexa (Wrapper Classses)
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Press 1 for Cube");
            System.out.println("Press 2 for Abs");
            System.out.println("Press 3 for Power ");
            System.out.println("Press 4 for Decimal to Binary");
            System.out.println("Press 5 for Binary to Decimal");
            System.out.println("Press 6 for Binary to Octal");
            System.out.println("Press 7 for Binary to Hexadecimal");
            System.out.print("Enter your choice");
            int ch=I.nextInt();
            switch(ch){
                case 1:System.out.println("Enter a number-:");
                int n1=I.nextInt();
                System.out.println("The cube of a number is"+Math.pow(n1,3));
                break;
                case 2:System.out.println("Enter a number-:");
                int n2=I.nextInt();
                System.out.println("The absolute of a number is"+Math.abs(n2));
                break;
                case 3:System.out.println("Enter a number-:");
                int n3=I.nextInt();
                System.out.println("Enter the power of number");
                int p=I.nextInt();
                System.out.println("The power of a number is"+Math.pow(n3,p));
                break;
                case 4:System.out.println("Enter a number in decimal-:");
                int n4=I.nextInt();
                System.out.println("Decimal to Binary is"+Integer.toBinaryString(n4));
                break;
                case 5:System.out.println("Enter a number in binary-:");
                String n5=I.next();
                System.out.println("Binary to Decimal is"+Integer.parseInt(n5,2));
                break;
                case 6:System.out.println("Enter a number in binary-:");
                String n6=I.next();
                System.out.println("Binary to octal is"+Integer.toHexString(Integer.parseInt(n6,2)));
                break;
                default:System.out.println("Wrong Choice");
            }


        }
}
