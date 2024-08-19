package Interview_Programs.Interview_Programs;

public class Stp19_zeros_ones {
	
	public static void main(String args[]) {
		int arr[]= {0,1,0,0,1,0,0,1};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==0) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println(arr[i]);
		}
	}

}
