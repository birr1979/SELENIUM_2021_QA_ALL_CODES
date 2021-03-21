package javaBasics_Class4;

		//This program calculates grades
		import java.util.*;

		public class GradeCalculate {
		  public static Scanner console = new Scanner(System.in);
		  public static int assignmentScore = 0;
		  public static int assignmentMax = 0;


		  public static void main (String[] args) {
		  giveIntro();

		  System.out.print("Homework and Exam 1 weights? ");
		  int homeworkWeight = console.nextInt();
		  int exam1Weight = console.nextInt();
		  int exam2Weight = 100 - homeworkWeight - exam1Weight;
		  System.out.print("Using weights of " + homeworkWeight + " " + exam1Weight + " " + exam2Weight);

		  System.out.println();   
		  System.out.println();
		  System.out.println("Homework:");


		  System.out.print("Number of assignments? ");
		  int numberOfAssignments = console.nextInt();
		  assignments(numberOfAssignments);

		  System.out.print("Sections attended? ");
		  int sectionsAttended = console.nextInt();
		  double weightedHomeworkScore = homework(sectionsAttended, homeworkWeight);

		  System.out.println();
		  System.out.println("Exam 1:");
		  double weightedExam1Score = exam(exam1Weight);
		  System.out.println();

		  System.out.println("Exam 2:");
		  double weightedExam2Score = exam(exam2Weight);
		  System.out.println();

		  double courseGrade = (double)weightedHomeworkScore + weightedExam1Score + weightedExam2Score;
		  System.out.println("Course grade = " + round2(courseGrade));
		  }

		   //Returns the given double value rounded to the nearest hundredth.
		   public static double round2(double number) {
		      return Math.round(number * 100.0) / 100.0;
		      }

		   //Outputs introduction
		   public static void giveIntro () {
		      System.out.println("This program accepts your homework scores and");
		      System.out.println("scores from two exams as input and computes");
		      System.out.println("your grade in the course.");
		      System.out.println();
		      }

		   //Returns the weighted score
		   public static double weightedScore(double i, double j, double k) {
		      return (i / j) * k;
		   }

		   //Takes the number of assignments input and asks for the score and max of each assignment
		   public static void assignments(int number) {
		      for (int i = 1; i <= number; i++) {
		         System.out.print("Assignment " + i + " score and max? ");
		         assignmentScore = assignmentScore + console.nextInt();
		         assignmentMax = assignmentMax + console.nextInt();
		      }
		   }

		   //Takes the sections attended and homework weight, then returns the weighted homework score
		   public static double homework(int i, int j) {
		      int totalEarnedPoints = assignmentScore + (i * 4);
		      int totalPoints = assignmentMax + 20;
		      System.out.println("Total points = " + totalEarnedPoints + " / " + totalPoints);
		      double weightedHomeworkScore = weightedScore(totalEarnedPoints, totalPoints, j);
		      System.out.println("Weighted score = " + round2(weightedHomeworkScore));   
		      return weightedHomeworkScore;
		   }

		   //Takes the exam weight, receives score and curve input, then returns the weighted scores for exams
		   public static double exam(int examWeight) {
		      double weightedExamScore = 0;
		      System.out.print("Score? ");
		      int examScore = console.nextInt();

		      System.out.print("Curve? ");
		      int examCurve = console.nextInt();
		      int examCurvedPoints = Math.min(examScore + examCurve, 100);

		      System.out.println("Total points = " + examCurvedPoints + " / 100");
		      System.out.println("Weighted score = " + round2(weightedExamScore));
		      return weightedExamScore = weightedScore(examCurvedPoints, 100, examWeight);
		   }
	


}
