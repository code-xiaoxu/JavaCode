package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Question27 {

       public static int removeElement(List<Integer> arr , int val) {
           for(Integer num:arr){
            if(num.equals(val)){
                arr.remove(num);
            }
          }
          return arr.size();
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(removeElement(arr, 3));
    }
}
