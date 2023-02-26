class Account {
    void deposit(int amount) {
        System.out.println("Account Class::Amount Deposited-:" + amount);
    }

    void withdraw(int amount) {
        System.out.println("Account Class::Amount Withdraw-:" + amount);
    }

    void rateOfInterest() {
        System.out.println("Account Class::roi is 12%");

    }

}

class SavingAccount extends Account {
    void limit() {
        System.out.println("Limit of Transaction in Saving Account-:");
    }
}

class CurrentAccount extends Account {
    void overDraftLimit() {
        System.out.println("Overdraft limit in Current Account-:");
    }

    @Override // Annotation for marking that we are overriding a function....
    void rateOfInterest() {
        System.out.println("Paying 5% rate of interest..");
    }
}

class AccountCaller {
    void callAccount(Account acc) {// Upcasting
        acc.deposit(10000);
        acc.withdraw(5000);
        acc.rateOfInterest();

        if (acc instanceof SavingAccount) {// operator that check weather obejct has instance or memory of Saving
                                           // account??
            // to call specific methods
            ((SavingAccount) acc).limit();// this is a downcast
        }
        if (acc instanceof CurrentAccount) {// operator that check weather obejct has instance or memory of Saving
                                            // account??
            // to call specific methods we have to downcast
            ((CurrentAccount) acc).overDraftLimit();
        }
        System.out.println();
        System.out.println("********************************");
        System.out.println();
    }
}

class IS_A {
    public static void main(String[] args) {
        // No dublicacy of account
        // DRY Principle
        AccountCaller ac = new AccountCaller();
        ac.callAccount(new SavingAccount());
        ac.callAccount(new CurrentAccount());
    }
}

// Java use upcasting and downcasting internally