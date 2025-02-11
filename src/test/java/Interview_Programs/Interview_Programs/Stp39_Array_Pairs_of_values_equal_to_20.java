package Interview_Programs.Interview_Programs;

import java.util.ArrayList;
import java.util.List;

public class Stp39_Array_Pairs_of_values_equal_to_20 {

	public static void main(String[] args) {
		Integer arr[]= {4,5,7,11,9,13,8,12};
		List<Integer> l1 = new ArrayList<Integer>();
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				sum=arr[i]+arr[j];
				if(sum==20) {
					l1.add(arr[i]);
					l1.add(arr[j]);
				}
			}
		}
		System.out.println(l1);

	}

}
