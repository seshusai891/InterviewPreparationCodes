package Interview_Programs.Interview_Programs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.common.collect.ForwardingMapEntry;

public class Practise_Puropse {
	
	public static void main(String args[]) {
		String name="Welcome to Java";
		String arr_value[];
		arr_value = name.split(" ");
		String rev="";
		System.out.println(arr_value.length);
		for(String w:arr_value) {
			String rev_words="";
			for(int i=w.length()-1;i>=0;i--) {
				rev_words=rev_words+w.charAt(i);
			}
			rev=rev+rev_words+" ";
		}
		System.out.println(rev);
		
		
				
	}
}