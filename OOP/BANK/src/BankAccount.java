public class BankAccount {
    private int accountNumber;
    private double cashInAccount;
    private String accountHolder;

    public BankAccount(int accountNumber, double cashInAccount, String accountHolder) {
        this.accountNumber = accountNumber;
        this.cashInAccount = cashInAccount;
        this.accountHolder = accountHolder;
    }
    public BankAccount() {
        this.accountNumber = 69696969;
        this.cashInAccount = 2000;
        this.accountHolder = "Nacho Komshiqta";
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void setCashInAccount(double cashInAccount) {
        this.cashInAccount = cashInAccount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double cash){
        this.cashInAccount+=cash;
    }


    public void withdraw(double cash){
        if (this.cashInAccount-cash >=0) {
            this.cashInAccount-=cash;
        }else{
            System.out.println("Cannot withdraw, because you haven't got enough money!");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", cashInAccount=" + cashInAccount +
                ", accountHolder='" + accountHolder + '\'' +
                '}';
    }
}
