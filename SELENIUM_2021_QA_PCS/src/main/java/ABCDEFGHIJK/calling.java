package ABCDEFGHIJK;

public class calling {
	
	static int x;
	
	static {
		x=45;
		int y=67;
		
	}
	
	 int y=2;
	
	
	
	  void a(int s) {
		 int y=7;
		this.x=s;
		
		
		System.out.println("this is the 1st Method");
	}
	
	void b() throws InterruptedException {
		 y=calling.c();
		Thread.sleep(5000);
		System.out.println(y+"this is the 2nd Method");
	}
	
	static int c() throws InterruptedException {
		calling c=new calling();
		c.b();
		System.out.println("this is the 3rd Method");
		return x;
	}
	

	public static void main(String[] args) throws InterruptedException {
c();

		
		

	}

}
