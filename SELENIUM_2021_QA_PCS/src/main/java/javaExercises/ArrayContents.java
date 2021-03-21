package javaExercises;

public class ArrayContents {

	public static void main(String[] args) {

		// Create the array of Strings
		String[] values = { "Products", "About", "Learn", "Careers", "Pricing", "Support" };

		for (int i = 0; i < values.length; i++) {
			if (values[i].equals("Careers")) {
				System.out.println("Careers is present in the array");
				break;
			} else {
				if (i == values.length - 1) {
					System.out.println("Careers is NOT present in the array");
				}
			}
		}

	}

}
