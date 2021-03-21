package Class5;

public class writeOnly {

	private String Subject="JAVA";

	public String setSubject(String Subject) {
		return this.Subject=Subject;
	}
	public static void main(String[] args) {

		writeOnly w=new writeOnly();
		String y =  w.setSubject("SELENIUM");
		System.out.println(y);

	} 
}