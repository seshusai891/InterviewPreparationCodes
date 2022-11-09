package Interview_Programs.Interview_Programs;

import java.util.Arrays;

public class Stp12_SecondLargest_Num_Array {
	
	public static void main(String args[]) {
		
		int arr[]= {4,2,8,10,7,6,12};
		int temp=0;
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];//4
				System.out.println(temp);
				arr[i]=arr[j];//
				System.out.println(arr[i]);
				arr[j]=temp;
				}
				}
//			System.out.println(arr[i]);
		}
System.out.println(arr[arr.length-2]);
	}

}
