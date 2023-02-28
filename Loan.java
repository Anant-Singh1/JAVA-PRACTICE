/* Q2. A Bank has 3 Kind of Accounts Home Loan Account , Education Loan Account, Car Loan Account , We need to write a Solution which make 
relationship among the classes by Using IS A or has A. So Customer can take Loan , based on the Loan He/She choose we need to prepare
it's EMI Plan. */
class Loan_Account {
    int principle;
    int roi;
    int tenure;

    public Loan_Account(int principle, int roi, int tenure) {
        this.principle = principle;
        this.roi = roi;
        this.tenure = tenure;
    }

    void rateOfInterest() {
        System.out.println("The rate of interest is-:" + roi);
    }

    void loanAmount() {
        System.out.println("The amount taken as a loan is-:" + principle);
    }

    void emiCalculator() {
        System.out.println("The emi need to be paid-:"
                + ((principle * roi * (float) Math.pow(1 + roi, tenure))
                        / (float) (Math.pow(1 + roi, tenure) - 1)));
    }

}

class Home_Loan_Account extends Loan_Account {
    String location;

    public Home_Loan_Account(int principle, int roi, int tenure, String location) {
        super(principle, roi, tenure);
        this.location = location;
        // TODO Auto-generated constructor stub
    }

    void location() {
        System.out.println("The location of home is-:" + location);
    }

}

class Education_Loan_Account extends Loan_Account {
    String name;

    public Education_Loan_Account(int principle, int roi, int tenure, String name) {
        super(principle, roi, tenure);
        this.name = name;
        // TODO Auto-generated constructor stub
    }

    void studentName() {
        System.out.println("The name of the student is-:" + name);
    }

}

class Car_Loan_Account extends Loan_Account {
    String info;

    public Car_Loan_Account(int principle, int roi, int tenure, String info) {
        super(principle, roi, tenure);
        // TODO Auto-generated constructor stub
        this.info = info;
    }

    void numberPlateInfo() {
        System.out.println("The number plate info is-:" + info);
    }

}

class LoanCaller {
    void callLoan(Loan_Account al) {
        al.loanAmount();
        al.rateOfInterest();
        al.emiCalculator();
        // Downcasting
        if (al instanceof Home_Loan_Account)
            ((Home_Loan_Account) al).location();
        else if (al instanceof Education_Loan_Account)
            ((Education_Loan_Account) al).studentName();
        else if (al instanceof Car_Loan_Account)
            ((Car_Loan_Account) al).numberPlateInfo();
        System.out.println();
        System.out.println("********************************");
        System.out.println();
    }

}

public class Loan {
    public static void main(String[] args) {
        LoanCaller lc = new LoanCaller();
        // Here we are doing upcasting...
        lc.callLoan(new Home_Loan_Account(10000, 5, 2, "Haldwani"));
        lc.callLoan(new Education_Loan_Account(20000, 12, 3, "Harry Lewis"));
        lc.callLoan(new Car_Loan_Account(15000, 15, 4, "UK07-SE-001"));
    }
}
