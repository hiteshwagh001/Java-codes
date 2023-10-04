public class countSubarrayproduct {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 10;
        int count = countprod(nums, k);
        System.out.println("Number of subarrays with product less than " + k + ": " + count);
    }
    public static int countprod(int[] nums, int k) {
        if (k <= 1) {
            return 0; 
        }

        int count = 0;
        int product = 1;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
}