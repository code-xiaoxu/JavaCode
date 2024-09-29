package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Question383 {
    /**
     * 赎金信
     * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
     *
     * 如果可以，返回 true ；否则返回 false 。
     *
     * magazine 中的每个字符只能在 ransomNote 中使用一次。
     *
     */
     public boolean canConstruct(String ransomNote, String magazine) {
       Map<Character,Integer> map_O = new HashMap<>();
       Map<Character,Integer> map_D = new HashMap<>();
        for(char s:magazine.toCharArray()){
            if(!map_O.containsKey(s)){
                map_O.put(s,1);
            }else{
                map_O.put(s,map_O.get(s)+1);
            }
        }
        for(char s:ransomNote.toCharArray()){
            if(!map_D.containsKey(s)){
                map_D.put(s,1);
            }else{
                map_D.put(s,map_D.get(s)+1);
            }
        }
        for(char s:ransomNote.toCharArray()){
            if(!map_O.containsKey(s) || map_D.get(s)>map_O.get(s)){
                return false;
            }
    }
    return true;
}
}
