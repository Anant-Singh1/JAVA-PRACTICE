// QUESTION 2 Basic ATM machine Menu
import java.util.Scanner;
public class Atm
{
    public static void main(String args[] )
    { 
        int accountbalance = 5000, withdrawal, deposit;
        Scanner I = new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to The Bankers.....");
            System.out.println("Press 1 for Withdraw");
            System.out.println("Press 2 for Deposit");
            System.out.println("Press 3 for Check Balance");
            System.out.println("Press 4 for EXIT");
            System.out.print("Please enter your choice:");
            int ch = I.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("Please enter money which you want to withdrawn:");
                withdrawal = I.nextInt();
                if(accountbalance >= withdrawal)
                {
                    System.out.println("Collect your money");
                   accountbalance =accountbalance - withdrawal;
                }
                else
                {
                    System.out.println("Balance is insuffcient");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Please enter money to be deposited:");
                deposit = I.nextInt();
                accountbalance = accountbalance + deposit;
                System.out.println("Your Money has been deposited successfully");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+accountbalance);
                System.out.println("");
                break;
 
                case 4:
                System.out.println("Thank-You for Using The Services");
                System.exit(1);
            }
        I.close();

        }

    }
}