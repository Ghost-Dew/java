package extend_03.extendsTheory;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("i9", 16, 512, "惠普");
        pc.printinfo();
        NotePad notePad = new NotePad("骁龙855", 16, 256, "蓝色");
        notePad.printinfo();
    }
}
class Computer{
    private String CPU;
    private int Memory;
    private int disk;

    public Computer(String CPU, int memory, int disk) {
        this.CPU = CPU;
        this.Memory = memory;
        this.disk = disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
    public String Getdetail(){
        return "CPU="+CPU+" 内存="+Memory+" 硬盘="+disk;
    }
}
class PC extends Computer{
    private String brand;

    public PC(String CPU, int memory, int disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printinfo(){
        System.out.println(Getdetail()+" 品牌="+brand);
    }
}
class NotePad extends Computer{
    private String color;

    public NotePad(String CPU, int memory, int disk, String color) {
        super(CPU, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printinfo(){
        System.out.println(Getdetail()+" 颜色="+color);
    }
}