package InterviewExecrise;

public class ArrayContents {

	public static void main(String[] args) {
		/*
		 * Write a Java program to test if an array contains a specific value • Create
		 * an array of Strings containing the following String values: • Products •
		 * About • Learn • Careers • Pricing • Support • The program you write should
		 * verify that the ‘Careers’ value is present in the array • Print out should
		 * clearly indicate if the value is present in the array or not
		 */

		String[] ArrayContent = { "Products", "About", "Learn", "Careers", "Pricing", "Support" };
		//Variable content

		String content ="Learn"; //the content Values can be modified to test different content of the lists.

		for (int i = 0; i < ArrayContent.length; i++) {

			if (ArrayContent[i].equalsIgnoreCase(content)) {
				System.out.println("'" + content + "'" + " is present in the Array");
				return;
			}
		}

		for (int j = 0; j < ArrayContent.length; j++) {
			if (ArrayContent[j]!=(content)) {
				System.out.println("'" + content + "'" + " is NOT present in the Array");
				break;
			}
		}


	}

}



