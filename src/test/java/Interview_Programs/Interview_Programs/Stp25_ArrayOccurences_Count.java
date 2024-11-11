package Interview_Programs.Interview_Programs;

import java.util.HashMap;

public class Stp25_ArrayOccurences_Count {

	public static void main(String[] args) {
		String arr[]= {"a","b","a","c","d","a","b"};
		
		HashMap<String,Integer> arrCount=new HashMap<String,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arrCount.containsKey(arr[i])) {
				int count=arrCount.get(arr[i]);
				arrCount.put(arr[i], ++count);
			}
			else {
				arrCount.put(arr[i], 1);
			}
		}
		System.out.println(arrCount);

	}

}
