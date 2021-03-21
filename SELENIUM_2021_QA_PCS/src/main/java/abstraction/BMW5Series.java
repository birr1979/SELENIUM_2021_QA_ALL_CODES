package abstraction;

public class BMW5Series extends BMW implements Interface1 {

	@Override
	public void startEngine() {
		System.out.println("5 Series is Starting It's Engine");
	}
	
	public static void main(String[] args) {
		BMW5Series series5 = new BMW5Series();
		series5.startEngine();
		series5.speedUp();
		series5.MyInterfaceMethod();
		series5.YourInterfaceMethod();

	}

	@Override
	public void MyInterfaceMethod() {
		System.out.println("Coming from MyInterfaceMethod");
		
	}

	@Override
	public void YourInterfaceMethod() {
		System.out.println("Coming from YourInterfaceMethod");
		
	}

	

}
