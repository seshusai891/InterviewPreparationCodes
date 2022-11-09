package Interview_Programs.Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stp4_List_Deleration {
	
	public static void main(String args[]) {
		
		String arr[]= {"sai","seshu","malla","sai"};
		System.out.println(Arrays.asList(arr));
		
		List<Integer> obj=new ArrayList<Integer>();
		
		obj.add(2);
		obj.add(4);
		obj.add(2);
		obj.add(8);
		for(int i:obj) {
			System.out.println(i);
		}
	}

}
