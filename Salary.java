    /* Q2.Compute Net Salary and Gross Salary , Take basic salary as an Input 
    e.g Enter the Basic Salary
    Compute HRA - 50% of the Basic Salary
    Compute TA - 30% of the Basic Salary
    Compute MA - 25% of the Basic Salary
    Compute PF - 10% of the Basic Salary
    Gross Salary = Basic Salary + HRA + TA + MA 
    Tax = 10% Tax on Gross Salary
    Net Salary = GrossSalary - Tax - PF
    Print Net Salary

    Print the Salary Slip of the Employee */
    import java.util.Scanner;
    public class Salary {
        public static void main(String[] args) {
            Scanner I=new Scanner(System.in);
            System.out.print("Enter the basic salary-: ");
            int basicsalary=I.nextInt();
            double HRA=0.5*basicsalary;
            double TA=0.3*basicsalary;
            double MA=0.25*basicsalary;
            double PF=0.1*basicsalary;
            double GrossSalary=basicsalary+HRA+TA+MA;
            double tax=0.1*GrossSalary;
            double NetSalary=GrossSalary-tax-PF;
            System.out.println("<------------Hero Pvt------------>");
            System.out.println("\n<----Salary Slip for Oct 2022---->");
            System.out.println("\n  Basic Salary           "+basicsalary);
            System.out.println("\n  House Rent Allowence   "+HRA);
            System.out.println("\n  Conveyance Allowence   "+TA);
            System.out.println("\n  Medical Allowence      "+MA);
            System.out.println("\n  Professional Tax       "+PF);
            System.out.println("\n  Gross Salary           "+GrossSalary);
            System.out.println("<--------------------------------->");
            System.out.println("\n  NET PAY                "+NetSalary);
    I.close();   
        }
    }
