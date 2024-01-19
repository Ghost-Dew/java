public class test {
    public static void main(String[] args) {
        calender calender = new calender(2023, 11, 22);
        System.out.println(calender.run(calender.month));//判断是否是闰年
        System.out.println("本月有"+calender.dayOfMonth()+"天");
        System.out.println("今天是今年的第"+calender.dayOfYear()+"天");
//        calender.dateadd();
        calender.week();
    }
}
