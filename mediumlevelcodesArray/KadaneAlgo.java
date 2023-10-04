public class KadaneAlgo {
    public static void main(String[] args){
        int arr[]={-1,-2,-3,-4};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
