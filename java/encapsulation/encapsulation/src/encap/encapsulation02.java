package encap;

public class encapsulation02 {
    public static void main(String[] args) {
        AccountTest accountTest = new AccountTest();
        accountTest.Test();
    }
}
class Account{
    private String name;
    private double balance;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2&&name.length()<=4) {
            this.name = name;
        }else{
            System.out.println("请输入正确格式，长度应在2-4位之间，默认为丁真");
            this.name="丁真";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance>20) {
            this.balance = balance;
        }else {
            System.out.println("余额必须大于20，你不够钱给你10块回家种地吧");
            this.balance=10;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()==6) {
            this.password = password;
        }else {
            System.out.println("密码必须是6位数，默认为123456");
            this.password="123456";
        }
    }
    public String info(){
        return "名字："+name+" 余额："+balance+" 密码："+password;
    }
}
class AccountTest{
    public void Test(){
        Account account = new Account();
        account.setName("张三");
        account.setBalance(2);
        account.setPassword("666666");
        System.out.println(account.info());
    }
}