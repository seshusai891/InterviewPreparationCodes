package Interview_Programs.Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stp34_Subset_Array {

	public static void main(String[] args) {
		Integer arr1[]= {1,2,3,4};
		Integer arr2[]= {2,3};
		
		List<Integer> l1=new ArrayList(Arrays.asList(arr1));
		List<Integer> l2=new ArrayList(Arrays.asList(arr2));

		boolean isarr2SubsetofArr1=l1.containsAll(l2);
		
		boolean isarr1SubsetofArr2=l2.containsAll(l1);
		
		System.out.println(isarr2SubsetofArr1);
		System.out.println(isarr1SubsetofArr2);
//		-----------Method 2-------------
		Set<Integer> s1=new HashSet(Arrays.asList(arr1));
		Set<Integer> s2=new HashSet(Arrays.asList(arr2));

		boolean arr2SubsetofArr1=s1.containsAll(s2);
		
		boolean arr1SubsetofArr2=s2.containsAll(s1);
		
		System.out.println(arr2SubsetofArr1);
		System.out.println(arr1SubsetofArr2);
		
	}

}
