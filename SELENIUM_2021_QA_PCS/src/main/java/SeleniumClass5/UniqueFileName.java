package SeleniumClass5;

import java.util.Date;

public class UniqueFileName {
//FOR SCREEEN SHOOT WE NEED THIS UNIQUE FILE NAME CREATION
	public static void main(String[] args) {
Date myDate= new Date();
System.out.println(myDate);

		String fileName= myDate.toString().replace(":", "_").replace(" ","_");
		System.out.println(fileName);
		
		//extract the date
		String day=fileName.substring(0,10);
		String time=fileName.substring(11,19);
		System.out.println(day);
		System.out.println(time);

	}

}
