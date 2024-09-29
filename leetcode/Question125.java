package leetcode;

import java.util.Arrays;

public class Question125 {
    /**
     * 验证回文串
     * 如果在将所有大写字符转换为小写字符、
     * 并移除所有非字母数字字符之后，短语正着读和反着读都一样。
     * 则可以认为该短语是一个 回文串 。
     *
     */
    public static void main(String[] args) {
        String s = "a,ab,b:A";
        char a = 'a';
        char b = 'a';
        System.out.println(a==b);
        StringBuffer sb =new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String res = sb.reverse().toString().toLowerCase();
        System.out.println(res);
    }
}
