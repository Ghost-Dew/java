package VsInterface;

public class LittleMonkey extends Monkey implements Fishable,Birdable{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void climbing() {
        System.out.println(name+"会爬树....");
    }

    @Override
    public void flying() {
        System.out.println(name+"通过学习，学会了飞....");
    }

    @Override
    public void swimming() {
        System.out.println(name+"通过学习，学会了游泳....");
    }

}
