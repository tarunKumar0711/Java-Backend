package javaPractice;
class Stud{
	String name;
	int rollNo;
	
	public Stud() {}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setRoll(int roll) {
		this.rollNo=roll;
	}
	
	public String getName()
	{	
		return name;
	}
	
	public int getRoll() {
		return rollNo;
	}
		
}
public class Encapsulation {
	public static void main(String args[]) {
		
		Stud tarun = new Stud();
		tarun.setName("Tarun");
		tarun.setRoll(34);
		
		System.out.println("Student name is "+ tarun.getName()+ "\nRoll No is "+ tarun.getRoll());
	}
}
