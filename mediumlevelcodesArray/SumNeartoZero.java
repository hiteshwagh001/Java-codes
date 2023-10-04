public class SumNeartoZero {
    public static void main(String[] args){
        int[] arr={-21,-67,-37,-18,4,-65};
        System.out.println(SumtoZero(arr));
    }
    public static int SumtoZero(int arr[]){
        int ans=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(sum>ans){
                    ans=sum;
                }
            }
        }
        return ans;
    }
}
