public class matchSum {
    public static void main(String args[]) {
        int arr[] = { 2, 4, 1, 6, 8, 5 };
        int sum = 10;
        findSum(arr,sum);

    }

    public static void findSum(int arr[],int sum){ 
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("index "+i+" , index "+j);
                    return;
                }
            }

        }   
        System.out.println("no pair is found") ;
            
        
    }
}    

    
