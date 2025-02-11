package Interview_Programs.Interview_Programs;

import java.util.Arrays;

public class Stp26_ArrayRevStore {

	public static void main(String[] args) {
		String name="Hello World";
		String rev1="";
		String arr1[]=name.split(" ");
		for(int i=0;i<arr1.length/2;i++) {
			String j=arr1[i];
			arr1[i]=arr1[arr1.length-i-1];
			arr1[arr1.length-i-1]=j;
		}
		System.out.println(Arrays.toString(arr1));
		
		for(String w:arr1) {
			rev1=rev1+w+" ";
		}
		System.out.println(rev1);
		
		int arr[]= {1,2,3,4};
		
		int arr2[]= {1,6,2,4};
		for(int i=0;i<arr2.length/2;i++) {
			int j=arr2[i];
			arr2[i]=arr2[arr1.length-i-1];
			arr2[arr2.length-i-1]=j;
		}
		System.out.println(Arrays.toString(arr2));
//		-------------------------------------------------------------
		for(int i = 0; i < 2; i++) {
			int count=arr.length / 2;
            // Swapping the elements
				System.out.println("count value is "+count);
				System.out.println("i value is "+i);
            int j = arr[i];//a[0-2]=1,2,j=1,2
//            	j=arr[0]=1
//            	j=arr[1]=2
            	System.out.println("j value is "+j);
            arr[i] = arr[arr.length - i - 1];
	          //arr[4-0-1]=arr[3]->4,arr[0]=4
	          //arr[4-1-1]=arr[2]->3,arr[1]=3
		          //arr[4-2-1]=arr[1]->2,arr[2]=2
		          //arr[4-3-1]=arr[0]->1,arr[3]=1
            	System.out.println("i value is "+arr[i]);
            arr[arr.length - i - 1] = j;//arr[8]=1
              //arr[4-0-1]=arr[3]->arr[3]=j value is 1 ->
	          //arr[4-1-1]=arr[2]->arr[2]=j value is 2
		          //arr[4-2-1]=arr[1]->2,arr[2]=2
		          //arr[4-3-1]=arr[0]->1,arr[3]=1
//            final statement arr[0]=4,arr[1]=3,arr[2]=2,arr[1]=1
        }

        // Output
        System.out.println("Reversed Array :" + Arrays.toString(arr)); 

	}

}
