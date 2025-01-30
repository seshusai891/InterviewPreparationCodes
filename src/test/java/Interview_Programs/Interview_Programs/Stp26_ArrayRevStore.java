package Interview_Programs.Interview_Programs;

import java.util.Arrays;

public class Stp26_ArrayRevStore {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		
		int arr1[]= {1,6,2,4};
		for(int i=0;i<arr1.length/2;i++) {
			int j=arr1[i];
			arr1[i]=arr1[arr1.length-i-1];
			arr1[arr1.length-i-1]=j;
		}
		System.out.println(Arrays.toString(arr1));
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
