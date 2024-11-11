package Interview_Programs.Interview_Programs;

public class Stp24_Stars {

	public static void main(String[] args) {
		int row=4;
		for(int i=0;i<4;i++) {
//			System.out.println("i value is "+ i);
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4;i>=0;i--) {
//			System.out.println("i value is "+ i);
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
