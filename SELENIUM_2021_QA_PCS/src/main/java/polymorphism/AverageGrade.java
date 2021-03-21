package polymorphism;

public class AverageGrade {

	/*
	 * Students can take 2 or 3 classes We need to find out the average grade
	 * regardless of the # of classes
	 */

	public String studentAverageGrade(double class1, double class2) {

		String grade;

		double average = (class1 + class2) / 2;

		if (average >= 0.9) {
			grade = "A";
		} else if (average >= 0.8) {
			grade = "B";
		} else if (average >= 0.75) {
			grade = "Needs Improvement";
		} else {
			grade = "Not able to Calculate";
		}

		return grade;

	}

	public String studentAverageGrade(double class1, double class2, double class3) {

		String grade;

		double average = (class1 + class2 + class3) / 3;

		if (average >= 0.9) {
			grade = "A";
		} else if (average >= 0.8) {
			grade = "B";
		} else if (average <= 0.8) {
			grade = "Needs Improvement";
		} else {
			grade = "Not able to Calculate";
		}

		return grade;

	}

	public static void main(String[] args) {
		
		AverageGrade avg = new AverageGrade();
		String gradeResult = avg.studentAverageGrade(0.76, 0.78);
		System.out.println(gradeResult);
		
		String gradeResult3 = avg.studentAverageGrade(.76, .77, .79f);
		System.out.println(gradeResult3);

	}

}
