package SmallChangesys;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        SmallChangesysoop tool = new SmallChangesysoop();
        Scanner input = new Scanner(System.in);
        do {
            tool.mainMenu();
            tool.choose=input.nextInt();
            switch (tool.choose){
                case 1:
                    tool.detail();
                    break;
                case 2:
                    tool.income();
                    break;
                case 3:
                    tool.pay();
                    break;
                case 4:
                    tool.exit();
                    break;
                default:
                    System.out.println("请选择正确的功能");
                    break;
            }
        }while(tool.loop);
    }
}
