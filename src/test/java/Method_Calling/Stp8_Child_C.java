package Method_Calling;

public class Stp8_Child_C extends Stp8_Child_B{

	void display(String loc) {
		System.out.println("This is child class C "+loc);
	}
	void callMethodsParentChild() {
		super.display();
		this.display("Bnglr");
		super.display("Seshu");
	}
	public static void main(String[] args) {
		Stp8_Child_C obj=new Stp8_Child_C();
		obj.callMethodsParentChild();

	}

}
