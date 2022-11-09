package Interview_Programs.Interview_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Stp5_Set_Deleration {
	
	public static void main(String args[]) {
		
		String arr[]= {"sai","seshu","malla","sai"};
		
		Set<String> arrSetList=new HashSet<String>(Arrays.asList(arr));
		System.out.println("Array.asList "+arrSetList);
		
		Set<String> arrSet=new HashSet<String>();
		Collections.addAll(arrSet,arr);
		System.out.println("Collections.addAll "+arrSet);
		
		Set<String> obj=new HashSet<String>();
		obj.add("Seshu");
		obj.add("sai");
		obj.add("malla");
		obj.add("sai");
		obj.add("Sai");
		for(String s:obj) {
			System.out.println(s);	
		}
	}

}
