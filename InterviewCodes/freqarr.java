import java.io.*;
import java.util.*;
class freqarr{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
//		int freq[]=new int[n];
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);				
		}
		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			System.out.println("Element "+entry.getKey()+ " Frequency "+entry.getValue());
		}
	}
}
