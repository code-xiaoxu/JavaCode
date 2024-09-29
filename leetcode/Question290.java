package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Question290 {
    /**
     * 单词规律
     * 简单
     * 相关标签
     * 相关企业
     * 给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
     *
     * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。
     */
     public boolean wordPattern(String pattern, String s) {
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        String[] p = pattern.split("");
        String[] ss =s.split(" ");
        if(p.length!=ss.length){
            return false;
        }
        for(int i = 0 ;i< ss.length;i++){
            String x = p[i];
         String   y = ss[i];
            if((map1.containsKey(x) && !map1.get(x).equals(y) ||
            map2.containsKey(y) && !map2.get(y).equals(x))){
                return false;
            }
            map1.put(x,y);
            map2.put(y,x);
        }
    return true;
    }
}
