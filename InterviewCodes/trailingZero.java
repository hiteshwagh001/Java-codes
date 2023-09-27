public class trailingZero {
    public static void main(String args[]) {
        int num = 1009009;
        countTrailingZeros(num);
    }

    private static void countTrailingZeros(int num) {
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) {
                count++;
            } else {
                break; 
            }
            num = num / 10;
        }
        System.out.println("Number of trailing zeros are " + count);
    }
}
