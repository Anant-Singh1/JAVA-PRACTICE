import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Please enter 1 for Hindi");
        System.out.println("Please enter 2 for English");
        int choice = I.nextInt();
        MessageResourceBundleReader mrr = new MessageResourceBundleReader(choice);
        // System.out.print("Enter the id-:");
        // Harcoding is relieved--->we need to oly change in the bundle file...
        System.out.println(mrr.getValue("input.id"));
        int id = I.nextInt();
        // System.out.print("\nEnter name of employee-:");
        System.out.println(mrr.getValue("input.name"));
        I.nextLine();
        String name = I.nextLine();
        // System.out.print("\nEnter the basic salary of employee-:");
        System.out.println(mrr.getValue("input.salary"));
        double basicsalary = I.nextDouble();
        // Employee emp=new Employee();//default constructor is being callled-->they are
        // predefined in java already...not compalsory to create a constructor....
        // so problem arises that we want to use the these local variables values but
        // also want company name to get printed so this() method is being used...
        Employee emp = new Employee(id, name, basicsalary);// this is a parameterized constructor;
        emp.setDepartmentName("IT");
        System.out.println(emp);
        I.close();
    }
}