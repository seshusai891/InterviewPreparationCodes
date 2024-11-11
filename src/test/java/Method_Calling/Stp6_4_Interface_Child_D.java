package Method_Calling;

public class Stp6_4_Interface_Child_D implements Stp6_1_Interface_A,Stp6_2_Interface_B,Stp6_3_Interface_C{
	
	
	
	@Override
	public void visible() {
		System.out.println("Interface C");
		
	}

	@Override
	public void show() {
		System.out.println("Interface B");
		
	}

	@Override
	public void display() {
		System.out.println("Interface A");
		
	}
	public static void main(String args[]) {
		Stp6_4_Interface_Child_D obj=new Stp6_4_Interface_Child_D();
		obj.display();
		obj.show();
		obj.visible();
	}


}
