package polymorphism;

public class ChildTwo extends Parent {
	
	//Overriding Method 
	public void eat() {
		System.out.println("Child 2 is Eating");
	}

	public static void main(String[] args) {
		
		ChildTwo c2 = new ChildTwo();
		c2.eat();
		
		Parent p = new Parent();
		p.eat();
		
	}

}
