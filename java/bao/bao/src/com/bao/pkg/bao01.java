package com.bao.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class bao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //使用系统提供Arrays完成数组排序
        int[] a={-1,20,-5};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
