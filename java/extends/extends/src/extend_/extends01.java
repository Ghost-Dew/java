package extend_;

public class extends01 {
    public static void main(String[] args) {
        pupol pupol = new pupol();
        pupol.name="小明";
        pupol.age=10;
        pupol.setScore(60);
        pupol.testing();
        pupol.showinfo();
        System.out.println("==============");
        Graduate graduate = new Graduate();
        graduate.name="张三";
        graduate.age=20;
        graduate.setScore(100);
        pupol.testing();
        graduate.showinfo();
    }
}
