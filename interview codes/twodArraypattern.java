public class twodArraypattern {
    public static void main(String[] args) {
        int rows = 2;
        int columns = 2;
        int n = 4;
        int count = 1;
        int arr[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 && j == 0) {
                    arr[i][j] = n;
                } else {
                    n = n * 10 + count;
                    arr[i][j] = n;
                    count++;
                    n/=10;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
