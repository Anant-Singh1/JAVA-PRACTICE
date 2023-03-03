
/* Abstract class can have both abstract and  non-abstract methods*/
/* Also abstract methods need to be overidded no matter what by the child classes */
abstract class LoanTime {
    int amount;
    // abstract int time;

    void applyLoan() {
        System.out.println("Apply for loan....");
    }

    /*
     * We know that abstract class don't allow to create us a object but still we
     * can create a constructor using super keyword
     */
    LoanTime() {
        System.out.println("Loan class default constructor");
    }

    LoanTime(int amount) {
        this.amount = amount;
        System.out.println("Its a param.. constructor--->Amount=>" + amount);
    }

    abstract void rateOfInterst();
}

class HomeLoan extends LoanTime {
    HomeLoan() {
        super();
    }

    boolean validDrivingLicense() {
        return true;
    }

    @Override
    void rateOfInterst() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'rateOfInterst'");
        System.out.println("rate of interest-->10%");
    }
}

class AutoLoan extends LoanTime {
    AutoLoan(int amount) {
        super(amount);
    }

    boolean validProertyDocs() {
        return true;
    }

    @Override
    void rateOfInterst() {
        // TODO Auto-generated method stub
        System.out.println("rate of interest-->0%");
        // throw new UnsupportedOperationException("Unimplemented method
        // 'rateOfInterst'");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        /*
         * Loan loan = new Loan();// here Loan is generic enitity and we cannot identify
         * which kind of loan it
         * is??...will give error because we cannot make object of abstract class.....
         */
        HomeLoan homeloan = new HomeLoan();
        AutoLoan autoloan = new AutoLoan(20000);
    }
}
