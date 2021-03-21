package ResumeUpload;

public class CountDownTimer {

	public static void main(String[] args) throws InterruptedException {


		int seconds=60;
		System.out.println(seconds+": Seconds count Down.");
		
		for(int i=seconds;i>=1;i--) {
			System.out.print(i+", ");
			Thread.sleep(1000);
			
		}
System.out.println("Time is Up!");
	}

}
