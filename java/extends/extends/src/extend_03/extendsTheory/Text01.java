package extend_03.extendsTheory;

public class Text01 {
    public static void main(String[] args) {
        /*
         按查找关系来返回信息
        1、首先看子类是否有该属性，如果子类有该属性且可以访问就返回该属性的信息
        2、如果子类没有该属性，就看父类有没有这个属性（如果有该属性且可以访问就返回该属性的信息）
        3、如果父类没有这个信息，就按照步骤2继续查找上级父类，知道object。。。
         */
        Sun sun = new Sun();
        System.out.println(sun.name);//返回值是大头儿子
        System.out.println(sun.getGrandpaAge());
        System.out.println(sun.hobby);//返回值是旅游
    }
}

class Grandpa {
    String name = "大头爷爷";
    String hobby = "旅游";
    int age=100;

    public int getGrandpaAge() {
        return age;
    }
}

class Grandfather extends Grandpa {
    String name = "大头爸爸";
    private int age = 30;
    public int getAge(){
        return age;
    }
}

class Sun extends Grandfather {
    String name = "大头儿子";
}