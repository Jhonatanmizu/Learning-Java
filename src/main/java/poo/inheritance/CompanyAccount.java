package poo.inheritance;

public class CompanyAccount extends Account {
    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    private double loanLimit;

    public CompanyAccount() {
        super();
    }

    public CompanyAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }


    public static void main(String[] args) {
    }

    public void loan(double amount) {
        if(amount <= this.loanLimit){
            this.balance += amount - 10;
        }
    }


    @Override
    public String toString() {
        return "CompanyAccount{" +
                "loanLimit=" + loanLimit +
                "} " + super.toString();
    }
}
