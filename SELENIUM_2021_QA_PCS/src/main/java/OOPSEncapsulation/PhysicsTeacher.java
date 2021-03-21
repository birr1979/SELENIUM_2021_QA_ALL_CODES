package OOPSEncapsulation;

public class PhysicsTeacher  extends Inheritance{
//IS-A relation
	String mainSubject="physics";
	void teachingsubject() {
		System.out.println("physics teaching master");
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PhysicsTeacher physTeacher=new PhysicsTeacher();
physTeacher.teaching();

System.out.println(physTeacher.designation);

physTeacher.teachingsubject();
	}

}
