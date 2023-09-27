import java.util.ArrayList;
import java.util.List;

public class commonele {
    public static void main(String[] args) {
        int arr1[] = { 12, 21, 14 ,56};
        int arr2[] = { 32, 53, 56 };
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    list.add(arr1[i]);
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
