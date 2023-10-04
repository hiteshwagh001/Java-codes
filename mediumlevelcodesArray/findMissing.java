<<<<<<< HEAD
import java.util.HashSet;

public class findMissing {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        int[] missingElements = findMissingElements(array1, array2);

        System.out.print("Missing elements in the second array: ");
        for (int element : missingElements) {
            System.out.print(element + " ");
        }
    }

    public static int[] findMissingElements(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array1) {
            set.add(num);
        }

        int[] missingElements = new int[array2.length];
        int count = 0;

        for (int num : array2) {
            if (!set.contains(num)) {
                missingElements[count++] = num;
            }
        }

        int[] result = new int[count];
        System.arraycopy(missingElements, 0, result, 0, count);

        return result;
    }
=======
import java.util.HashSet;

public class findMissing {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        int[] missingElements = findMissingElements(array1, array2);

        System.out.print("Missing elements in the second array: ");
        for (int element : missingElements) {
            System.out.print(element + " ");
        }
    }

    public static int[] findMissingElements(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array1) {
            set.add(num);
        }

        int[] missingElements = new int[array2.length];
        int count = 0;

        for (int num : array2) {
            if (!set.contains(num)) {
                missingElements[count++] = num;
            }
        }

        int[] result = new int[count];
        System.arraycopy(missingElements, 0, result, 0, count);

        return result;
    }
>>>>>>> ce26fe690b2e0f1099459643bb8cfb6f72708a05
}