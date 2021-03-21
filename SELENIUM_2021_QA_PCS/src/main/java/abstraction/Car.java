package abstraction;

public abstract class Car {
	
	//Abstract Method
	public abstract void startEngine();
	
	
	//Non-Abstract Method
	public  void speedUp() {
		System.out.println("Car is Speeding Up");
	}

	
	public static void main(String[] args) {
		
		//Can't create an object of an Abstract Class
//		Car myCar = new Car();
		
		
	}
}
