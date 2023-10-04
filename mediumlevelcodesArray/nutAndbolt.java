import java.util.*;

public class nutAndbolt {
    public static void main(String[] args) {
        char nuts[] = { '@', '%', '$', '#', '^' };
        char bolts[] = { '#', '@', '%', '$', '^' };
        // Arrays.sort(nuts);
        // Arrays.sort(bolts);
        for(int i=0;i<nuts.length;i++){
            for(int j=0;j<nuts.length-i-1;j++){
                if(nuts[j]>nuts[j+1]){
                    char temp = nuts[j];
                    nuts[j] = nuts[j + 1];
                    nuts[j + 1] = temp;
                }
            }
            for(int j=0;j<bolts.length-i-1;j++){
                if(bolts[j]>bolts[j+1]){
                    char temp = bolts[j];
                    bolts[j] = bolts[j + 1];
                    bolts[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nuts));
        System.out.println(Arrays.toString(bolts));
    }
}
