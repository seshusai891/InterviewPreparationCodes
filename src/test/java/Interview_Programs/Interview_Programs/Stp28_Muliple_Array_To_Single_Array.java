package Interview_Programs.Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stp28_Muliple_Array_To_Single_Array {

	public static void main(String[] args) {
		Integer arr1[]= {1,2,3};
		Integer arr2[]= {4,5,6};
		Integer arr3[]= {8,9,10};
		Integer arr4[]= {4,5,6};
		
		List<Integer> lst=new ArrayList<Integer>(Arrays.asList(arr1));
		lst.addAll(Arrays.asList(arr2));
		lst.addAll(Arrays.asList(arr3));
		lst.addAll(Arrays.asList(arr4));
		
		Collections.sort(lst);
		
		for(int w:lst) {
			System.out.print(w+" ");
		}
		System.out.println();
		for(Integer i=0;i<lst.size();i++) {
			System.out.print(lst.get(i)+" ");
		}
	}

}
