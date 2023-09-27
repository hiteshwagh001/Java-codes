import java.util.*;
public class removeEle {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,4,6};
        int remove=4;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==remove){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                count++;
            }
        }
        int finalarr[]=new int[arr.length-count];
        for(int i=0;i<arr.length-count;i++){
            finalarr[i]=arr[i];
        }
        System.out.println(Arrays.toString(finalarr));
    }
}
