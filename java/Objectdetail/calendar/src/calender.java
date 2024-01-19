public class calender {
    int year;
    int month;
    int day;

    public calender(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean run(int year1){   //判断是否是闰年
        if (year1%4==0&&year1%100!=0||year1%400==0) return true;
        else return false;
    }

    public int dayOfMonth(){   //判断本月有几天
        int[] arr={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if (run(year)) arr[2]=29;
        return arr[month];
    }

    public int dayOfYear(){     //判断今天是本年的第几天
        int[] arr={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if (run(year)) arr[2]=29;
        int sum=0;
        for (int i = 1; i < month; i++) {
            sum+=arr[i];
        }
        sum+=day;
        return sum;
    }

    public void dateadd(){  //判断明天日期
        int[] arr={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if (run(year)) arr[2]=29;
        if (day<arr[month]){
            day++;
        } else if (month<12) {
            day=day+1-arr[month++];
        }else {
            year++;
            month=1;
            day=1;
        }
        System.out.println("明天是"+year+"年"+month+"月"+day+"日");
    }
    public void week(){
        int m=0;
        for (int i = 1; i < year; i++) {
            if (run(i)) m++;
        }
        int n=((year-1)*365+m+dayOfYear())%7;
        System.out.println("今天是星期"+n);
    }
}
