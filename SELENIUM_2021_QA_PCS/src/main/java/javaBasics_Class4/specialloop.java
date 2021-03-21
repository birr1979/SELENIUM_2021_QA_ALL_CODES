package javaBasics_Class4;

public class specialloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for each loop for arry
		
		String [][] Cars = {{"Ford", "Dodge", "Chevy"},{"Toyota", "BMW", "Benz", "Honda"}}; //2 list array
		String [] Subjects= {"Math", "English", "Scince", "History","Programming"};
		
		for(String k: Subjects) {
			System.out.println(k);
		}
		

//		for(String [][] Cars) {
//			System.out.println(k);
//		}
		
		
		 for (int m=0;m<4;m++) {
			 System.out.println("gor to test"+m);
		 }

	}

}
