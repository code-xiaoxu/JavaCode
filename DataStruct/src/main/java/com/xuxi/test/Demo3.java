package com.xuxi.test;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (fun(num)) {
                System.out.println(num + "是素数");
            } else {
                System.out.println(num + "不是素数");
            }
        }
    }

    public static boolean fun(int num) {
        if (num <= 1) {
            throw new RuntimeException("输入错误");
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
