class sumiszeroofsubarr{
    public static void main(String[] args) {
        int arr[]={6,-1,-3,4,-2,2,4,6,-12,-7};
        System.out.println(countZeroSum(arr));
    }

    private static int countZeroSum(int[] arr) {
        int count=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==0){
                    count++;
                }
            }
        }

        return count;
    }
}