package SeleniumClass4;

public class throwsVSthrowble {
    static int a = 12, b = 5, c;


    static void divide() {
        if (b == 5) {
            throw new ArithmeticException("can not devide by 5.");

        } else {
            c = a / b;
            System.out.println(c);
        }
    }


    public static void main(String[] args) {

        try {
            System.out.println(a / 0);
            divide();

        } catch (ArithmeticException e) {
            System.out.println("Please enter different number" + e);

//		System.out.println(a/0);
        } catch (Exception e) {
            System.out.println("2nd exception" + e);
        } finally {
            System.out.println("final message always printed.");
        }


        //final, finally and finalize
        //checked and unchecked


    }

}
