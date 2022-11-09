package Interview_Programs.Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stp20_Rearrange_Array_String {
	
	public static void main(String args[]) {
		String arr[]=new String[] {"a","c","b","e","g","k","d","f","h","i"};
		List<String> arr_rev=new ArrayList();
		//print arr values using for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println("Before sort"+" "+arr[i]);
		}
		//print sorted arr values using for loop
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println("sorted"+" "+arr[i]);
		}
		//print reverse order arr values using for loop
				for(int i=arr.length-1;i>=0;i--) {						
//						arr_rev.add(arr[i]);
					System.out.println("reverse order"+" "+arr[i]);
			}
//				for(int i=0;i<arr.length;i++) {
//					System.out.println("after reverse sort"+" "+arr[i]);
//				}
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				String temp=arr[i];
//				System.out.println("temp and i values "+" "+temp+" "+arr[i]);
				arr[i]=arr[j];
				arr[j]=temp;
			}
//		System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			System.out.println("after reverse sort"+" "+arr[i]);
		}
	}

}
