package JavaQueez;

public class displayValues {


//	public displayValues(int num1, int num2) {
//		int total;
//		total=num1+num2;
//		System.out.println(total);
//		}
	
	public int displayValues(int num1, int num2) {
		int total=num1+num2;
		System.out.println("Sum is: " + total);
		return total;
		}

	public static void main(String[] args) {
		displayValues obj =new displayValues();
		obj.displayValues(12, 12);
		
}
	}
