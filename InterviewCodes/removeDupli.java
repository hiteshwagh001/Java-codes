import java.util.*;

public class removeDupli {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4, 6};
        
        // Use a Set to automatically remove duplicates
        Set<Integer> uniqueSet = new HashSet<>();
        
        for (int num : arr) {
            uniqueSet.add(num);
        }
        
        // Convert the Set back to an array
        int[] unique = new int[uniqueSet.size()];
        int i = 0;
        
        for (int num : uniqueSet) {
            unique[i++] = num;
        }
        
        System.out.println(Arrays.toString(unique));
    }
}
