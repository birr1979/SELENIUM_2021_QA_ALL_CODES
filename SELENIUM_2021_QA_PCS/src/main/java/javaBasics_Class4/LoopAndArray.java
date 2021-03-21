package javaBasics_Class4;

public class LoopAndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=1;i<15;i++) 
{
System.out.println("Iteration Number: " + i);
}
System.out.println("Iteration End");
		
System.out.println("=================================");

String [] Subjects= {"Math", "English", "Scince", "History","Programming"};
System.out.println(Subjects.length);
for (int i=0; i<5;i++) //-- there will be exception if its out of bound in the array.
System.out.println(Subjects [i]);

//or 
System.out.println("=============================================");
for (int i=0; i<Subjects.length;i++) //-- there will be exception if its out of bound in the array.
System.out.println(Subjects [i]);

System.out.println("=============================================");

for (String Subject: Subjects) {
	System.out.println(Subject);

for(int i=0;i>0;i++)
System.out.println(i);
System.out.println("===================================================");

String [][] Cars = {{"Ford", "Dodge", "Chevy"},{"Toyota", "BMW", "Benz", "Honda"}}; //2 list array
String item =Cars[0][2];
System.out.println(item);
System.out.println(Cars[1][1]);

for(String[] i: Cars) {
	System.out.println(i);
}


System.out.println("===================================================");

//Nested For Loop
//Access all items in the cars array using nested for loop

for (int i=0;i<Cars.length;i++) {//outer for loop
	
	for (int z=0;z<Cars[i].length;z++) {//inner for loop
		System.out.println(Cars[i][z]);
	}
	System.out.println("inner loop exited");
}


	}}

	
	
	
	
	
	
}
