import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFromArray {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9}; 

        String largestNumber = largestNumber(nums);
        System.out.println("Largest Number: " + largestNumber);
    }

    public static String largestNumber(int[] nums) {
        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numsStr, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });

        if (numsStr[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String numStr : numsStr) {
            result.append(numStr);
        }

        return result.toString();
    }
}
