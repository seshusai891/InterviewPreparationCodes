package Interview_Programs.Interview_Programs;

public class Stp14_Array_Largest_Num {
	
	public static void main(String args[]) {
		
		int arr[]= {-9,-8,10,4,7,3,9,20};
//				i=	0	1 2  3 4 5 6 7
//				j=      1 2  3 4 5 6 7
//	Method 1
		int maxnum = arr[0];
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr[0] value is "+arr[i]+" and max value is "+ maxnum);
			if(arr[i]>maxnum) {
				maxnum=arr[i];
			}
		}
		System.out.println("Largest Num Using Method 1 "+maxnum);
//		Method 2
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
//			System.out.println("i value is "+i);
//			System.out.println("arr[i] value is "+arr[i]);
			for(int j=i+1;j<arr.length;j++) 
//			System.out.println("j value is "+j);
			{
//				System.out.println("j value is "+j);
//				System.out.println("arr[j] value is "+arr[j]);
				if(arr[i]>arr[j]) {
//					System.out.println("if condition arr[i] and arr[j] "+arr[i]+" "+arr[j]);
					temp=arr[i];
//					System.out.println("if condition temp value is "+temp);
					arr[i]=arr[j];
//					System.out.println("if condition arr[j] assigned to arr[i] is "+arr[i]);
					arr[j]=temp;
//					System.out.println("if condition temp assigned to arr[j] is "+arr[j]);
				}
			}
//			System.out.println("Largest Num Using Method 2 "+arr[i]);
		}
		System.out.println("Largest Num Using Method 2 "+arr[arr.length-1]);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	}

}
