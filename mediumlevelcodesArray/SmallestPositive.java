import java.util.*;

public class SmallestPositive {
    public static void main(String[] args) {
        int[] arr = { 0, -10, 1, 3, -20 };
        
        System.out.println("Using Set (find):");
        System.out.println(find(arr));
        
        System.out.println("Using Array Manipulation (findbyArr):");
        System.out.println(findbyArr(arr));
    }

    public static int find(int arr[]) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }
        int num = 1;
        while (set.contains(num)) {
            num++;
        }
        return num;
    }

    public static int findbyArr(int arr[]) {
        int n = arr.length;
        separate(arr);

        int p = 0;
        while (arr[p] > 0) {
            p++;
        }
        p++;

        int counter = 1;
        for (int i = p; i < n; i++) {
            if (arr[i] != counter) {
                return counter;
            }
            counter++;
        }
        return counter;
    }

    public static void separate(int arr[]) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }
}
