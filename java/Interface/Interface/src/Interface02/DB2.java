package Interface02;
//程序员C的工作
public class DB2 implements DBInterface{
    @Override
    public void connect() {
        System.out.println("DB2数据库已连接");
    }

    @Override
    public void close() {
        System.out.println("DB2数据库已断开");
    }
}
