package Interview_Programs.Interview_Programs;

import java.util.ArrayList;
import java.util.List;

public class Stp29_Compare_Two_Arrays_Not_present_Display {

	public static void main(String[] args) {
		int arr[]= {1,4,8,10};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		//convert arr to arrayList
		List<Integer> arrLst=new ArrayList<>();
		for(int w:arr) {
			arrLst.add(w);
		}
		List<Integer> lst=new ArrayList<>();
		for(int i=0;i<=max;i++) {
			lst.add(i);
		}
		
		List<Integer> output=new ArrayList<>();
		for(int num:lst) {
			if(!arrLst.contains(num)) {
				output.add(num);
			}
		}
		System.out.println(output);

	}

}
