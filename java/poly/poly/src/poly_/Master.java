package poly_;
public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //某人给小狗喂骨头
    public void feed(Animal animal,Food food){
        System.out.println(name+"喂"+animal.getName()+"吃"+food.getName());
    }
}
