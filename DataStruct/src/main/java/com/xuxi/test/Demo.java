package com.xuxi.test;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",4);
//        String maxkey = null;
        List<String> maxkey = new ArrayList<>();

        Integer maxvalue = 0;
        for(Map.Entry<String, Integer> entry:   map.entrySet()){
            if(entry.getValue() > maxvalue){
                maxvalue = entry.getValue();
                maxkey.clear();
                maxkey.add(entry.getKey());
            }else if(entry.getValue() == maxvalue){
                maxkey.add(entry.getKey());
            }
        }
        System.out.println(maxkey);
    }
}
