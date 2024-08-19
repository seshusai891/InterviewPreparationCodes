package Interview_Programs.Interview_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stp18_Occurences_Words_String {
	
	public static void main(String args[]) {
		String value="Today is today and tomorrow is today and today is tomorrow for holiday";
		String arr_value[]= {};
		arr_value=value.split(" ");
//		arr=sen.split("[ ,.']+");//split with multiple special characters
		HashMap<String,Integer> valueCount=new HashMap<String,Integer>();
		for(int i=0;i<arr_value.length;i++) {
			if(valueCount.containsKey(arr_value[i])) {
				int count=valueCount.get(arr_value[i]);
				valueCount.put(arr_value[i], ++count);		
			}
			else {
				valueCount.put(arr_value[i], 1);
			}
		}
		System.out.println(valueCount);
		
		//Only today repeats
		String word="today";
		int Count=0;
		for(int i=0;i<arr_value.length;i++) {
			if(word.equals(arr_value[i])) {
				Count++;
			}
		}
		System.out.println(word+" "+Count);
		
		//remove Duplicates
		Set<String> rem_Dupli=new HashSet<String>();
		for(int i=0;i<arr_value.length;i++) {
			rem_Dupli.add(arr_value[i]);
		}
		System.out.println(rem_Dupli);
		
		//Unique words
		for(int i=0;i<arr_value.length;i++) {
			int count=1;
			for(int j=i+1;j<arr_value.length;j++) {
				if(arr_value[i].equalsIgnoreCase(arr_value[j])) {
				count++;
				arr_value[j]="";
				}
			}
			if(count==1 && arr_value[i]!="") {
				System.out.print(arr_value[i]+" ");
			}
		}
		
	
	}

}
