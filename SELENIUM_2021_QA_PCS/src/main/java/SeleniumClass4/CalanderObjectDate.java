package SeleniumClass4;

import java.util.Calendar;

public class CalanderObjectDate {

    //create a static variable for the date
    static int targetDay = 0, targetMonth = 0, targetYear = 0;
    static int currentDay = 0, currentMonth = 0, currentYear = 0;

    //create static variables for determiningn how many months/year to jump

    static int jumpMonthBy = 0, jumpYearsBy = 0;
    //default update required boolean
    static boolean increment = true;


    //1. Create a method to get the current date that retrieve the Gregorian calendar day

    public static void getcurrentdate() {
        Calendar cal = Calendar.getInstance();
        System.out.println("calendar get instance" + Calendar.getInstance());

        currentDay = cal.get(Calendar.DAY_OF_MONTH);
        currentMonth = cal.get(Calendar.MONTH);
        currentYear = cal.get(Calendar.YEAR);

    }

    //2. Create a method to for the target day MM/DD/YYYY

    public static void targetDate(String dateString) {
        //index of first occurrence of "/"
        int firstIndex = dateString.indexOf("/");

        //index of last occurrence of "/"
        int lastIndex = dateString.lastIndexOf("/");

        //capture the date numbers
        String MM = dateString.substring(0, firstIndex);
        targetMonth = Integer.valueOf(MM);
        String DD = dateString.substring(firstIndex + 1, lastIndex);
        targetDay = Integer.valueOf(DD);
        String YYYY = dateString.substring(lastIndex + 1, dateString.length());
        targetYear = Integer.valueOf(YYYY);
        System.out.println(targetMonth + " " + targetDay + " " + targetYear);
    }


    //3. create a method to determine how many years to jump

    public static void yearsToJump() {
        if ((targetYear - currentYear) > 0) {
            jumpYearsBy = (targetYear - currentYear);
        } else {
            jumpYearsBy = (currentYear - targetYear);
        }
    }

    //4. create a method to determine how many Month to jump

    public static void monthToJump() {
        if ((targetYear > currentYear)) {//clicking forward
            jumpMonthBy = ((jumpYearsBy * 12) + (targetMonth - currentMonth));

        } else if (targetYear == currentYear) {
            if (targetMonth > currentMonth) {
                jumpMonthBy = ((jumpYearsBy * 12) + (targetMonth - currentMonth));
            } else {
                jumpMonthBy = ((jumpYearsBy * 12) + (currentMonth - targetMonth));
//				increment =false;
            }
        } else if (targetYear < currentYear) {
            jumpMonthBy = (jumpYearsBy * 12) + (currentMonth - targetMonth);
//			increment =false;

        }

    }


    public static void main(String[] args) {
        //check Method 1
        getcurrentdate();
        System.out.println("Current date is : " + currentDay + "/" + (currentMonth + 1) + "/" + currentYear);

        //check Method 2
        targetDate("12/04/2021");
        System.out.println("Target Date is: " + targetDay + "/" + targetMonth + "/" + targetYear);

        //calculate the number of month to jump
        monthToJump();
        System.out.println("Jump Month By: " + jumpMonthBy);
        yearsToJump();
        System.out.println("Jump Year By: " + jumpYearsBy);

//Practice here @https://jqueryui.com/accordion/


        //find elements and click the targeted Calendar items.


    }

}
