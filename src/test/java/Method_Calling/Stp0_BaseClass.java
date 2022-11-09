package Method_Calling;

public class Stp0_BaseClass {
	
	final static int a=10,b=20;
	 static int h=40;
	
	final public static void show() {
//		a=50;
		h=50;
		int c = a;
		System.out.println(c);
		c=100;
		System.out.println(c);
//		int d=20,q=30;
		
	}

}
