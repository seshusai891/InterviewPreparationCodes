package Interview_Programs.Interview_Programs;

public class Stp15_Sum_Odd_Even {
	
	public static void main(String args[]) {
		int arr[]= {-9,-8,2,4,10,9,3,7};
		int even_num=0;
		int odd_num=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even_num=even_num+arr[i];
			}
			else {
				odd_num=odd_num+arr[i];
			}
			
		}
		System.out.println("Even sum "+even_num+" "+"Odd Sum "+odd_num);
	}

}
