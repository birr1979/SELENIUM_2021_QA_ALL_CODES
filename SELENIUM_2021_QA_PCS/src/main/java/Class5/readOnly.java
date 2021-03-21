package Class5;

public class readOnly {
	private String CompanyName="IT Pros";
	
	public String getCompanyName() {
		return CompanyName;
	}

	public static void main(String[] args) {
		readOnly readString=new readOnly();

		System.out.println(readString.getCompanyName());

	}

}
