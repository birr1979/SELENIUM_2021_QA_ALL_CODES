package oops_inheritance;

import oops_inheritance_2.Teacher;

public class HistoryTeacher extends Teacher {
	
	String mainSubject = "History";
	
	void teachingSubject() {
		System.out.println("History Teacher is Teaching History");
	}

	public static void main(String[] args) {
		
		//Create an object of the HistoryTeacher class (not the Teacher class)
		HistoryTeacher histTeacher = new HistoryTeacher();
		System.out.println(histTeacher.designation);
		System.out.println(histTeacher.mainSubject);
		histTeacher.teachingSubject();
		histTeacher.teaching();

	}

}
