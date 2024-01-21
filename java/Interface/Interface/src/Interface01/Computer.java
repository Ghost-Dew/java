package Interface01;

public class Computer {
    public void work(USBInterface USB){
        USB.start();
        USB.stop();
    }
}
