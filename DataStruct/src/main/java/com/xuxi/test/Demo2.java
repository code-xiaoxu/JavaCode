package com.xuxi.test;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(5);
        for (int i = 0; i < 500; i++) {
            list.add(i);
        }
    }
}
