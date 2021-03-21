package SeleniumClass4;

public class exceptions {
    // Method which throws Exception
    public static void testException()
            throws Exception {

//	        throw new Exception("New Exception Thrown");
        throw new ArithmeticException("new exception ");
    }

    public static void main(String[] args) throws Exception {
        // checked  compile time and unchecked run time exceptions  --> interview question what exception you work with
        //Throw Vs Throws interview questions


        try {

            testException();
        } catch (Throwable e) {
            // Print using tostring()
            System.out.println("Exception: " + e.toString());
        } finally {

            System.out.println("finally");

        }


    }

}

