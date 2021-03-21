package SeleniumClass5;


class google {


    public static void main(String[] args) {

        String myString = "mahi";
        String reverse = "";

        for (int i = (myString.length() - 1); i >= 0; i--) {
//			System.out.print(myString.charAt(i));
            reverse = reverse + myString.charAt(i);


        }

        if (myString.equals(reverse)) {
            System.out.println("is paldom");

        } else {
            System.out.println("not");
        }
    }

}
 