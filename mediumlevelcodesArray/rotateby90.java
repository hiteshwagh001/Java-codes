public class rotateby90 {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        int newarr[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            int col = arr.length - i - 1;
            for (int j = 0; j < arr[i].length; j++) {
                newarr[i][j] = arr[j][col];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(newarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}