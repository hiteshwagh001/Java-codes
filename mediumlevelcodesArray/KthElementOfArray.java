<<<<<<< HEAD
public class KthElementOfArray {
    public static void main(String[] args) {
        int arr1[] = { 2, 36, 7, 9 };
        int len1 = arr1.length;
        int arr2[] = { 1, 4, 8, 10 };
        int len2 = arr2.length;
        int k = 5; 

        int finalarr[] = new int[len1 + len2];
        int i = 0, j = 0, m = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                finalarr[m] = arr1[i];
                i++;
            } else {
                finalarr[m] = arr2[j];
                j++;
            }
            m++;
        }

        while (i < len1) {
            finalarr[m] = arr1[i];
            i++;
            m++;
        }

        while (j < len2) {
            finalarr[m] = arr2[j];
            j++;
            m++;
        }

        if (k >= 1 && k <= finalarr.length) {
            System.out.println(k+"th element: " + finalarr[k - 1]); 
        } else {
            System.out.println("Invalid k");
        }
    }
}
=======
public class KthElementOfArray {
    public static void main(String[] args) {
        int arr1[] = { 2, 36, 7, 9 };
        int len1 = arr1.length;
        int arr2[] = { 1, 4, 8, 10 };
        int len2 = arr2.length;
        int k = 5; 

        int finalarr[] = new int[len1 + len2];
        int i = 0, j = 0, m = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                finalarr[m] = arr1[i];
                i++;
            } else {
                finalarr[m] = arr2[j];
                j++;
            }
            m++;
        }

        while (i < len1) {
            finalarr[m] = arr1[i];
            i++;
            m++;
        }

        while (j < len2) {
            finalarr[m] = arr2[j];
            j++;
            m++;
        }

        if (k >= 1 && k <= finalarr.length) {
            System.out.println(k+"th element: " + finalarr[k - 1]);
        } else {
            System.out.println("Invalid k");
        }
    }
}
>>>>>>> ce26fe690b2e0f1099459643bb8cfb6f72708a05
