package Detail;

public class homework02 {
    public int addOne(final int x){
        //++x;这里是错误的因为final修饰的不能再修改了
        return x+1;//这里是允许的
    }
    public static void main(String[] args) {

    }
}
