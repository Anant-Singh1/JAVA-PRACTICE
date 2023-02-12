import java.util.Date;

public class Employee {// if class is public then it means file name must match the class name.
    private int id;// these are instance variable-->will get memory when object gets defined.
    private String name;
    private double salary;
    private String companyName;
    private String departmentName;

    // every class has a default constructor by default only..
    // when a obejct gets created using the new keyword, it actually call a
    // constructor
    // use to initialize the instance variable--
    // return nothing --no void--->if we write void in front of constructor then it
    // will get a treatment of method.
    public Employee() {// default constructor
        companyName = "Bankers Pvt Ltd";// since company will be same for all employees
    }

    // now parameterized constructor-->
    // This is constructor overloading...
    public Employee(int id, String name, double salary) {
        // but we also want default company name as well so we will use this()
        this();// calling default constructor-->must be first line because its work is
               // initailization

        // we have to put the value of local variable created in test employee to the
        // instance variable
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // for updation
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    // USING SRP
    private double hra() {
        return salary * 0.50;
    }

    private double daa() {
        return salary * 0.30;
    }

    private double ta() {
        return salary * 0.20;
    }

    private double ma() {
        return salary * 0.25;
    }

    private double pf() {
        return salary * 0.05;
    }

    private double gs() {
        return salary + hra() + daa() + ta() + ma();
    }

    private double tax() {
        return gs() * 0.10;
    }

    private double ns() {
        return gs() - pf() - tax();
    }

    @Override // overriding toString method of object class
    public String toString() {
        Formatting formatting = new Formatting("US", "en");// has a relationship
        Date date = new Date();

        String allowences = "\nHRA-:" + formatting.format(hra()) + " " + "\nDA-:" + formatting.format(daa()) + " "
                + "\nTA-:" + formatting.format(ta()) + " "
                + "\nMA-:" + formatting.format(ma())
                + " " + "\nPF-:" + formatting.format(pf()) + " " + "\nGS-:" + formatting.format(gs()) + " " + "\nTAX-:"
                + formatting.format(tax()) + " "
                + "\nNET SALARY-:" + formatting.format(ns());
        return "Date is-:" + formatting.formatDate(date) + " " + "\nID-:" + id + " " + "\nNAME-:"
                + formatting.getTitleCase(name) + "\nSALARY-:"
                + salary + " "
                + "\nCOMPANY NAME-:" + companyName
                + " " + "\nDEPARTMENT NAME-: " + departmentName + "\n" + "ALLOWENCES-:" + allowences;
    }
    // \instead of using print method use toString
    // public void print() {
    // System.out.println(
    // "ID-:" + id + " " + "\nNAME-:" + name + "\nSALARY-:" + salary + " " +
    // "\nCOMPANY NAME-:" + companyName
    // + " " + "\nDEPARTMENT NAME-: " + departmentName);
    // }
}
