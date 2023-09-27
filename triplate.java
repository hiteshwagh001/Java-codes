import java.util.*;

public class triplate {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 4, 5, 3 };
        int n = arr.length;
        System.out.println(isTriplate(arr, n));
        System.out.println(isTriplet2(arr, n));

    }

    public static boolean isTriplate(int arr[], int n) {
        if (n < 3) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (arr[i] * arr[i] == arr[j] * arr[j] + arr[k] * arr[k]
                            || arr[i] * arr[i] == arr[j] * arr[j] + arr[k] * arr[k]
                            || arr[i] * arr[i] == arr[j] * arr[j] + arr[k] * arr[k] && i != j && j != k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isTriplet2(int[] arr, int n) {
        if (n < 3) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        Arrays.sort(arr);

        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (arr[left] + arr[right] == arr[i]) {
                    return true;
                }
                if (arr[left] + arr[right] < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }
}
