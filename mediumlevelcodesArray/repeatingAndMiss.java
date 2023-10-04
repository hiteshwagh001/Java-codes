import java.util.*;

public class repeatingAndMiss {
    public static void main(String[] args) {
        int[] arr = { 2, 2 };

        System.out.println("Using Set (find):");
        findAndDupl(arr);

    }

    public static void findAndDupl(int arr[]) {
        Arrays.sort(arr);
        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                System.err.print(num);
                break;
            }
            num++;
        }

        Map<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        Integer maxKey = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.print(" "+maxKey);

    }
}
