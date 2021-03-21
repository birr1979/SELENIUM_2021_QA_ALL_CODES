package SeleniumClass5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        System.out.println(myList);

        //Add to myList
        myList.add(55); //Index 0
        myList.add("Jay"); //Index 1
        myList.add(true); //Index 2
        myList.add('h'); //Index 3
        myList.add(null); //Index 4
        myList.add(60.10); //Index 5

        System.out.println(myList);

        //Tell me the size of the ArrayList
        System.out.println(myList.size());

        //Update the ArrayList - Replace null with 40
        myList.set(4, 40);

        System.out.println(myList);

        //Add "Jay" to the ArrayList at index 4
        myList.add(4, "Jay");

        System.out.println(myList);

        //Remove the true from the ArrayList
//		myList.remove(true);
        myList.remove(2);
        System.out.println(myList);

        //Retrieve the 2nd element from the ArrayList
        System.out.println(myList.get(5));

//		System.out.println("****** FOR LOOP *******");
//		//Use For loop to access each element in the Array List
//		for(int i = 0; i<myList.size(); i++) {
//			System.out.println("Item Number: " + i + " -- " + myList.get(i));
//		}
//		
//		System.out.println("****** FOR EACH LOOP *******");
//		//Use For Each loop to access each element in the ArrayList
//		for(Object myItem : myList) {
//			System.out.println(myItem);
//		}
//		
//		System.out.println("****** Iterator *******");
//		Iterator iteration = myList.iterator();
//		
//		while(iteration.hasNext()) {
//			System.out.println(iteration.next());
//		}

        myList.add(0, "Hello");

        int myNum = (Integer) myList.get(0);
        System.out.println(myNum);

        String myName = (String) myList.get(1);


        //Generics - We are specifying a Generic Data Type using < >
        //restricts the type of data that can be stored in the Array List
        List<Integer> myIntegerList = new ArrayList<Integer>();
        myIntegerList.add(90);
//		myIntegerList.add("Hello"); //Returns an exception

        List<String> myStringList = new ArrayList<String>();
        myStringList.add("Jay");
//		myStringList.add(50.30); //Returns an exception


    }

}
