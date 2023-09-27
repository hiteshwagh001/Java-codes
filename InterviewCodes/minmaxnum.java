public class minmaxnum {
    public static void main(String[] args){
        int[] arr={1,2,4,5,7,9,10};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("min:"+min+"\nmax: "+max);
    }
}
