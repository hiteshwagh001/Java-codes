public class DuplicateElements {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 5, 6, 11, 11 };

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            int num = arr[i];

            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                System.out.println("Duplicate number: " + num);
            }
        }
    }
}