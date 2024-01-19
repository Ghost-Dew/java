package Static_;
public class Child {
    String name;
    public static int count;
    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name+"加入了游戏");
    }
}