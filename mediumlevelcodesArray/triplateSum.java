// triplate from the array sum is zero then return 1 else 0
public class triplateSum {
    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, 3, 1 };
        System.out.println(checkTriplate(arr));
    }

    private static boolean checkTriplate(int arr[]) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
