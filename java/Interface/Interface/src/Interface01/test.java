package Interface01;

public class test {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(camera);
        computer.work(phone);
    }
}
