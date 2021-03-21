package Class5;

public class SUBMIT_REQUEST {

	public static boolean submitRequest( ) {

		String CapturedString="SUBMIT REQUEST";
		String ExpectedString="Submit Request";

		if (CapturedString.equalsIgnoreCase(ExpectedString)) {

			System.out.println(CapturedString+" is the same as "+ ExpectedString);
			return true;
		}
		else 
			System.out.println(CapturedString+" is not the same as "+ ExpectedString);
			return false;

	}

	public static void main(String[] args) {

		submitRequest();
	}

}
