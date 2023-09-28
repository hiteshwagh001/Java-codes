import java.util.Scanner;

public class MaxOfsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int arraySize = sc.nextInt();
        int arr[] = new int[arraySize];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter subarray size:");
        int subArraySize = sc.nextInt();
        int[] maxArray = maxOfSubArray(arr, subArraySize);
        System.out.println("Maximum elements in each subarray of size " + subArraySize + ":");
        for (int max : maxArray) {
            System.out.print(max + " ");
        }
        sc.close();
    }

    private static int[] maxOfSubArray(int[] arr, int k) {
        int n = arr.length;
        int[] maxArray = new int[n - k + 1]; 
        int maxIndex = 0;

        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            maxArray[maxIndex++] = max;
        }

        return maxArray;
    }
}
