package StaticMethod_;

public class tes01 {
    public static void main(String[] args) {
        //在实际开发中，不涉及任何与对象相关的方法可将其写成静态方法，提高开发效率（如Math类）
        System.out.println(MyTool.sum(10,30));
    }
}
