package oops_inheritance;

import oops_inheritance_2.Teacher;

public class PhysicsTeacher extends Teacher {
	
	String mainSubject = "Physics";
	
	void teachingSubject() {
		System.out.println("Physics Teacher is Teaching Physics");
	}
	
	
	
	public static void main(String[] args) {
		
		PhysicsTeacher physTeacher = new PhysicsTeacher();
		physTeacher.teaching();
		System.out.println(physTeacher.designation);
		physTeacher.teachingSubject();
		
		
	}

}
