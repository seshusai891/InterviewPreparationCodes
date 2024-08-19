package Interview_Programs.Interview_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Stp22_Duplicates_Arrays {

	public static void main(String[] args) {
//		int arr[] and Integer[] arr -> int[] is an array of primitive int values. 
//		Integer[] is an "object" array, holding references to Integer objects. 
//		Most important practical difference: int[] cannot hold null values
		
//		Integer[] is an array (object) of objects
//		int[] is an array (object) of primitives
//		Integer i = new Integer(6);
//		String s = i.toString();//sets s the string representation of i
		
//		int i = 6;
//		String s = i.toString();//will not work!!!
		
		Integer[] arr1= {1,2,5,7,8};
		Integer[] arr2= {1,5,4,3};
		
		Set<Integer> set1=new HashSet<>(Arrays.asList(arr1));
		Set<Integer> set2=new HashSet<>(Arrays.asList(arr2));
		
		set1.retainAll(set2);
		
		Integer[] res=set1.toArray(new Integer[0]);
		System.out.println(Arrays.toString(res));

	}

}
