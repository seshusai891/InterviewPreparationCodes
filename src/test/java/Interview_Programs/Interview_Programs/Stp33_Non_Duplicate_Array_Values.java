package Interview_Programs.Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stp33_Non_Duplicate_Array_Values {

	public static void main(String[] args) {
//		Integer arr1[]= {1,2,3,4,1};
//		Integer arr2[]= {1,4,5,6,7};
		Integer arr1[]= {1,2,4,7,4,1,5};
		Integer arr2[]= {1,5,4,1};
		
		List<Integer> l1=new ArrayList(Arrays.asList(arr1));
		List<Integer> l2=new ArrayList(Arrays.asList(arr2));
		
		l1.removeAll(l2);
		System.out.println(l1);
		
		l2.removeAll(Arrays.asList(arr1));
		System.out.println(l2);
		
		l1.addAll(l2);
		System.out.println(l1);
//		-----------Method 2----------------------
		Set<Integer> s1=new HashSet(Arrays.asList(arr1));
		Set<Integer> s2=new HashSet(Arrays.asList(arr2));
		
		Set<Integer> commonelements=new HashSet(s1);
		commonelements.retainAll(s2);
		
		System.out.println("common elements of s1 and s2 "+commonelements);
		s1.removeAll(commonelements);
		s2.removeAll(commonelements);
		
		s1.addAll(s2);
		System.out.println(s1);

	}

}
