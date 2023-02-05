// Assignment - 1 
// Salary Slip of Employee
// Input : 
// Id - 1001
// name- amit srivastava - output : Amit Srivastava
// basic salary - 10000
// HRA - House Rent Allowance - 50% of Basic Salary
// DA - Dearness Allowance - 15% of BS
// TA - Travelling Allowance - 20% of BS
// MA - Medical Allowance - 20% of MA
// PF - 5% of the BS (Employee) + 5% Employer 
// GS - BS + HRA + DA + TA + MA
// TAX - >5L (Annual Salary) 10% Tax
// >7L 20% Tax
// >9L 30% Tax
// Print Salary Slip
// Amount - Rs Symbol 50,000
// Hint: 
// Date : Current Date
// Local class
// Follow : SRP, DRY , Pascal Case, camelCase, Encapsulation ,Data Hiding
class Employee{
private int  id;
private  String name;
private int basicSalary;
private double amount;
 
public void takeEmployeeInput(int id,String name,int basicSalary){
    this.id=id;
    this.name=name;
    this.basicSalary=basicSalary;
}

public void allAllowance(){
    double HRA=0.5*basicSalary;
    double TA=0.3*basicSalary;
    double MA=0.25*basicSalary;
    double PF=0.1*basicSalary;
    double GrossSalary=basicSalary+HRA+TA+MA;
}

public int annualSalaryCalculator(){
    return 12*basicSalary;
}

public void taxCalculator(){
    int annualSalary=annualSalaryCalculator();
    if(annualSalary>500000)
    amount=(annualSalary*90)/100;
    else if(annualSalary>700000)
    amount=(annualSalary*80)/100;
    else if(annualSalary>900000)
    amount=(annualSalary*70)/100;
}


public void printSalary(){
   System.out.println("Name-: "+name);
   System.out.println("ID-: "+id);
   System.out.println("Amount-:"+amount);
}
}
public class SalaryEmployee {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.takeEmployeeInput(111,"Harry Styles", 90000);
        emp1.printSalary();
    }
}
