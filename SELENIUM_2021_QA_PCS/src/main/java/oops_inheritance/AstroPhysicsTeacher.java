package oops_inheritance;

public class AstroPhysicsTeacher extends PhysicsTeacher {

	public static void main(String[] args) {
		
		AstroPhysicsTeacher aPhysics = new AstroPhysicsTeacher();
		System.out.println(aPhysics.designation);
		System.out.println(aPhysics.mainSubject);
		aPhysics.teaching();
	}

}
