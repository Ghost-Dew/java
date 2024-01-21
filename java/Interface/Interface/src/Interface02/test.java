package Interface02;

public class test {
    public static void main(String[] args) {
        MysqlDb mysqlDb = new MysqlDb();
        test.t(mysqlDb);
        Oracle oracle = new Oracle();
        test.t(oracle);
        DB2 db2 = new DB2();
        test.t(db2);
    }
    public static void t(DBInterface DB){
        DB.connect();
        DB.close();
    }
}
