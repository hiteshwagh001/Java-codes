import java.io.*;
import java.util.*;
public class sortarr {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int current =arr[i];
            int j=i-1;
            while(j>=0&&current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

        return arr;
    }
}
