package Interview_Programs.Interview_Programs;

import java.util.HashMap;
import java.util.Map;

public class Stp40_HashMap_StringOccurences {

	public static void main(String[] args) {
		String name="aabccce";
		String res="";
		HashMap<Character,Integer> strCount=new HashMap<Character,Integer>();
		for(int i=0;i<name.length();i++) {
			if(strCount.containsKey(name.charAt(i))) {
				int count=strCount.get(name.charAt(i));
				strCount.put(name.charAt(i), ++count);
			}
			else {
				strCount.put(name.charAt(i), 1);
			}
		}
		System.out.println(strCount);
		for(Map.Entry<Character, Integer> hm:strCount.entrySet()) {
			res +=hm.getKey()+String.valueOf(hm.getValue());
		}
		System.out.println(res);

	}

}
