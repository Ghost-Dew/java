package CodeBlock01;

public class text01 {
    public static void main(String[] args) {
        Movie 潜行 = new Movie("潜行");
    }
}
class Movie{
    private String name;
    private double price;
    private String directer;
/*
    以下构造器中都含有
        System.out.println("电影屏幕打开-------");
        System.out.println("广告中------------");
        System.out.println("电影正式开始-------");
        这样造成了代码的冗余，所以使用代码块可以解决一下问题
        这样不管调用哪个构造器都会先执行代码块里的内容。且代码块的调用优先于构造器。
 */
{
    System.out.println("电影屏幕打开-------");
    System.out.println("广告中------------");
    System.out.println("电影正式开始-------");
};
    public Movie(String name) {
//        System.out.println("电影屏幕打开-------");
//        System.out.println("广告中------------");
//        System.out.println("电影正式开始-------");
        System.out.println("Movie(String name)被调用----");
        this.name = name;
    }

    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开-------");
//        System.out.println("广告中------------");
//        System.out.println("电影正式开始-------");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String directer) {
//        System.out.println("电影屏幕打开-------");
//        System.out.println("广告中------------");
//        System.out.println("电影正式开始-------");
        this.name = name;
        this.price = price;
        this.directer = directer;
    }
}