package polymorphism;

public class ChildOne extends Parent {
	
	//Overriding Method
	@Override //Enforces the rules of Overriding Methods
	public void eat() {
		System.out.println("Child 1 is Eating");
	}
	
//	@Override //--> Cannot be an overriding method since parent's method is static
//	public void drinking() {
//		System.out.println("Child 1 is Drinking");
//	}
	
	//Not an overriding method
//	@Override // When placed over non-overriding methods, you get an error
	public void walking() {
		System.out.println("Child 1 is Walking");
	}

	public static void main(String[] args) {
		
		/*
		 * Reference Type: Parent
		 * Object Type: ChildOne
		 */
		Parent childObj = new ChildOne(); //Polymorphic Reference
		childObj.eat();
		
//		ChildOne childObj2 = new Parent(); //--> Not allowed - cannot convert from Parent to ChildOne
		
//		childObj.walking(); //--> cannot call walking() because it's not defined in Parent class
		
		
		/*
		 * Method Overridding is not being implemented below
		 */
		//No polymorphism implemented here 
		ChildOne childOneObj = new ChildOne(); //No polymorphic reference
		childOneObj.eat();
		
		//No polymorphism implemented here 
		Parent parentObj = new Parent(); //No polymorphic reference
		parentObj.eat();
		
	}
	
	
}
