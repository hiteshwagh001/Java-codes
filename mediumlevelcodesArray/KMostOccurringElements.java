import java.util.*;

public class KMostOccurringElements {
    public static List<Integer> kMostFrequentElements(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());

        list.sort((entry1,entry2)->entry2.getValue().compareTo(entry1.getValue()));

        List <Integer> result=new ArrayList<>();
        for(int i=0;i<k&&i<list.size();i++){
            result.add(list.get(i).getKey());
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 4, 4, 2, 2, 1, 1, 3 };
        int k = 2;
        List<Integer> result = kMostFrequentElements(arr, k);
        System.out.println(result); // Output: [4, 2]
    }
}
