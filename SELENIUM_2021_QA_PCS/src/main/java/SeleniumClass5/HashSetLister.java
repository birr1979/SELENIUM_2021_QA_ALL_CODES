package SeleniumClass5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLister {

	public static void main(String[] args) {
 //Interview question
		
//unlike ArrayList Sets do not allow duplicate values to be stored/ only Uniqe
		//Sets are unordered
		
			HashSet<String> set = new HashSet<String>();
			set.add("Birhanu");
			set.add("Nathan");
			set.add("Birhanu");
			
			Iterator<String> itr= set.iterator();
			
				
				while (itr.hasNext()){
				String item=itr.next();
				System.out.println(item);
				}
		
		
		
		

	}

}
