package SmallChangesys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
该类可以完成零钱通的各个功能
每个功能对应一个方法
 */
public class SmallChangesysoop {
    double money;
    double balance;
    String name;
    String key;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String detail = "-------零钱通明细----------";
    boolean loop = true;
    int choose;
    Scanner input=new Scanner(System.in);
    public void mainMenu() { //显示零钱通菜单
        System.out.println("----------零钱通菜单----------");
        System.out.println("       1、零钱通明细");
        System.out.println("       2、收益入账");
        System.out.println("       3、消费");
        System.out.println("       4、退出");
        System.out.print("请选择(1-4)：");
//        System.out.println("显示零钱通菜单");
    }

    public void detail() {  //零钱通明细
        System.out.println(detail);
    }

    public void income() {    //收益入账
        System.out.println("收益入账金额为");
        money = input.nextDouble();
        if (money <= 0) {
            System.out.println("请输入正确的金额");
            return;
        }
        balance += money;
        date = new Date();
        detail += "\n收益入账" + "\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
    }

    public void pay() {     //消费
        System.out.println("消费金额为");
        money = input.nextDouble();
        if (money<0||money > balance) {
            System.out.println("余额不足,您的消费金额应在0-"+balance);
            return;
        }
        System.out.println("消费了什么？");
        name = input.next();
        balance -= money;
        date = new Date();
        detail += "\n" + name + "\t-" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
    }

    public void exit() {     //退出
        while (true) {
            System.out.println("确认要退出吗？(y/n)");
            key = input.next();
            if ("y".equals(key) || "n".equals(key)) {
                break;
            }
        }
        //一段代码实现一个小功能（目的是让后期维护变得更容易）
        if ("y".equals(key)) {
            loop = false;
        }
    }
}
