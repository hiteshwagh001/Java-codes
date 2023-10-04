<<<<<<< HEAD
public class RowWithmax1 {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        System.out.println("Row with the maximum 1's: " + getMaxRow(arr));
    }

    private static int getMaxRow(int[][] arr) {
        int maxOnes = 0;
        int maxRow = -1; // Initialize with an invalid row index

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxOnes) {
                maxOnes = count;
                maxRow = i;
            }
        }

        return maxRow;
    }
}
=======
public class RowWithmax1 {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        System.out.println("Row with the maximum 1's: " + getMaxRow(arr));
    }

    private static int getMaxRow(int[][] arr) {
        int maxOnes = 0;
        int maxRow = -1; // Initialize with an invalid row index

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxOnes) {
                maxOnes = count;
                maxRow = i;
            }
        }

        return maxRow;
    }
}
>>>>>>> ce26fe690b2e0f1099459643bb8cfb6f72708a05
