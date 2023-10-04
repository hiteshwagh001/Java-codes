import java.util.*;
public class majorityele {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 3, 3, 2 };
        Map <Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Integer maxKey = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.print(maxKey);

    }
}
