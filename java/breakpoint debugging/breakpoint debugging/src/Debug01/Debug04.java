package Debug01;

import java.util.Arrays;

public class Debug04 {
    public static void main(String[] args) {
        int[] arr={1,-1,10,-20,100};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("hello1");
        System.out.println("hello2");
        System.out.println("hello3");
    }
}
