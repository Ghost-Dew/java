package Interface02;
//程序员B的工作
public class Oracle implements DBInterface{
    @Override
    public void connect() {
        System.out.println("Oracle数据库已连接");
    }

    @Override
    public void close() {
        System.out.println("Oracle数据库已断开");
    }
}
