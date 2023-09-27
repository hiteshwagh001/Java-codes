import java.io.*;

public class strongNum {
        public static void main(String args[]) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
        for (int i = 0; i < n; i++) {
            if (isStrong(arr[i])) {
                System.out.println("strong number is " + arr[i]);
            }
        }
    }

    public static boolean isStrong(int n) {
        int sum = 0;
        int num = n;
        while (n > 0) {
            int rem = n % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
}
