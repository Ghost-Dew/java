package Interface02;
//程序员A的工作
public class MysqlDb implements DBInterface{
    @Override
    public void connect() {
        System.out.println("Mysql数据库已连接");
    }

    @Override
    public void close() {
        System.out.println("Mysql数据库已断开");
    }
}
