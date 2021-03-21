package Class5;

public class TypeConversions {

	public static void main(String[] args) {
		/*
		 * 2 was to do it
		 * 1. automatically -- smaller to larger type (widening casting)
		 * 2. Manually	-- Larger to smaller datatype sizes (narrowing cating)
		*/
//Automatic
		//byte >Short>Char>int>long>floar>double
		byte myByte=1;
		short myShort;
		myShort=myByte;
		System.out.println(myShort);
		
		char myChar='a';
		int myInt;
		myInt=myChar;
		System.out.println(myInt); //will print the ACSII value from the ACSII lsit of charactors.
		
		
		int myIntValue=100;
		long myLong;
		myLong=myIntValue;
		System.out.println(myLong);//ACSII  American character encoding standard ASCII ( ASS-kee), abbreviated from American Standard Code f
		
		
		//Manual
		
		double myDouble=10.5;
		float myFloat;
//		myFloat=myDouble;  //Type mismatch because its not casted automatic 
			
		//correction temporarily Type-casting
		
		myFloat =(float) myDouble;
		
	//Strings Type Conversion 
		//String is a CLASS in JAVA  -- we need to treat the values as an object;
		
		
		//Wrapper Classes
		String myString="100";
		int num=Integer.valueOf(myString);
		System.out.println(num); //the string will be an integer value of 100
		
		
		//Convert datatype int to String;
		
		int integerValue=500;
		String intToString =Integer.toString(integerValue);
		System.out.println("to see if 50 is casted: ="+50+intToString +" is the converted value");
		
		
		
		
		
	}

}
