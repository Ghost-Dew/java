package TEXT.text06;

public class test {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(200);
//        System.out.println(checkingAccount.getBalance());//1199
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(200);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());
    }
}
