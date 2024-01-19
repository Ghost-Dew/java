import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangesys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money;
        double balance = 0;
        String name;
        String key;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String detail = "-------零钱通明细----------";
        boolean loop = true;
        int choose;
        do {
            System.out.println("----------零钱通菜单----------");
            System.out.println("       1、零钱通明细");
            System.out.println("       2、收益入账");
            System.out.println("       3、消费");
            System.out.println("       4、退出");
            System.out.print("请选择(1-4)：");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(detail);
                    break;
                case 2:
                    System.out.println("收益入账金额为");
                    money = input.nextDouble();
                    if (money <= 0) {
                        System.out.println("请输入正确的金额");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    detail += "\n收益入账" + "\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case 3:
                    System.out.println("消费金额为");
                    money = input.nextDouble();
                    if (money<0||money > balance) {
                        System.out.println("余额不足,您的消费金额应在0-"+balance);
                        break;
                    }
                    System.out.println("消费了什么？");
                    name = input.next();
                    balance -= money;
                    date = new Date();
                    detail += "\n" + name + "\t-" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case 4:
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
                    break;
                default:
                    System.out.println("请选择正确的功能（1-4）");
                    break;
            }
        } while (loop);
    }
}
