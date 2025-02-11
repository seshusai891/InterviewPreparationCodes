package Interview_Programs.Interview_Programs;

public class Stp32_Employee {
	int id;//instance variables
	String name;//instance variables
	String location;//instance variables
	
	Stp32_Employee(int id,String name){
//		Constrctor will not have any return type and void
//		Constructor is to intitialize varables
		this.id=id;
		this.name=name;
	}
	Stp32_Employee(){
		this.id=id;
		this.name=name;
	}
//	-------------------------------
	public void walking() {
		System.out.println(name+" is walking ");
	}
	public void running() {
		System.out.println(name+" is running, his id is "+id);
	}
//	-------------------------------
	public void seLocation(String loc) {
		this.location=loc;
	}
	public void display() {
		System.out.println("ID "+id);
		System.out.println("Name "+name);
		System.out.println("Location "+location);
	}
	public void display(int a,String s1) {
		System.out.println(a+" Method initializing "+s1);
	}
	public static void main(String[] args) {
		Stp32_Employee emp=new Stp32_Employee();
		Stp32_Employee emp1=new Stp32_Employee(10,"Seshu");
		Stp32_Employee emp2=new Stp32_Employee(20,"Ramesh");
		Stp32_Employee emp3=new Stp32_Employee(30,"sai");//we have do define some value,bcz constructor defined with int and string
		
		emp.walking();
		
		emp1.walking();
		emp2.running();
		emp3.display(40, "Sad");//defined own values
		
		System.out.println();
		emp2.seLocation("Bangalore");
		emp2.display();
		emp1.display();

	}

}
