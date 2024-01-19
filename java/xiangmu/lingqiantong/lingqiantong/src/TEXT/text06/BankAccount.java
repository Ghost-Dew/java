package TEXT.text06;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    //存款
    public void deposit(double amount){
        balance+=amount;
    }
    //取款
    public void withdraw(double amount){
        balance-=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
