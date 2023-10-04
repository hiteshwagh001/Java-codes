import java.util.Arrays;

public class kThsmallest {
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        int k=3;
        System.out.println(kthsmall(arr,k));
    }

    private static int kthsmall(int arr[],int k) {
        if(arr.length<k-1){
            return -1;
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
    
}
