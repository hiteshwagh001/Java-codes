
import java.io.*;
// class arraydemo{
//     public static void main(String[] args)throws IOException {
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("enter number of elements in the array you want ");
//         int num=Integer.parseInt(br.readLine());
//         int arr[]=new int[num];
//         System.out.println("enter elements in the array : ");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=Integer.parseInt(br.readLine());
//         }
//         System.out.println("even numbers in the array :");
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==0){
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }

// // maximum number in the array::
// class arraydemo {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("enter number of elements in the array you want ");
//         int num = Integer.parseInt(br.readLine());
//         int arr[] = new int[num];
//         System.out.println("enter elements in the array : ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = Integer.parseInt(br.readLine());
//         }
//         System.out.println("maximum numbers in the array :");
//         int max = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if(max<arr[i]){
//                 max=arr[i];
//             }


//         }
//         System.out.println(max);
//     }
// }
// maximum number in the array::
class arraydemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of elements in the array you want ");
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num];
        System.out.println("enter elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("maximum numbers in the array :");
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
