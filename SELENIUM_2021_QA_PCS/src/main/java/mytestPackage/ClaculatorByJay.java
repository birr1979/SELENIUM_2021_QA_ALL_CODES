package mytestPackage;

import java.util.Scanner;

public class ClaculatorByJay {

// create all operation methods here
	public int add(int num1, int num2) {
	int total=num1+num2;
	return total;
	}
	public int subtract(int num1, int num2) {
	int total=num1-num2;
	return total;
	}
	public int multiply(int num1, int num2) {
	int total=num1*num2;
	return total;
	}
	public double divide(double num1, double num2) {
		double total=num1/num2;
	return total;
	}
	
	public static void main(String[] args) {
	
		ClaculatorByJay calc=new ClaculatorByJay();
	
		Scanner scanobj= new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1=scanobj.nextInt();
		System.out.println("Enter the second number");
		int num2=scanobj.nextInt();
		System.out.println("Enter the operator +-*/");
		String Operator= scanobj.next();
		scanobj.close();
		
		switch (Operator) {
		case "+":
			System.out.println(num1+" +" +num2+" = "+(calc.add(num1, num2)));
			break;
		case "-":
			System.out.println(num1+" -" +num2+" = "+calc.subtract(num1, num2));
			break;
		case "*":
			System.out.println(num1+" *" +num2+" = "+calc.multiply(num1, num2));
			break;
		case "/":
			System.out.println(num1+" /" +num2+" = "+calc.divide(num1, num2));
			break;
			default:
				System.out.println("incorect operator");
				break;
		}
		
		

	}

}
