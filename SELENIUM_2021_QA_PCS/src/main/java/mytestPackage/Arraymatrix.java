package mytestPackage;

public class Arraymatrix {

	
	public static void main(String[] args) {
	//	int a[]=new int[5];
	//	int a[]= {100,200,300,400,500}; single dimentional arraay
	//	System.out.println(a.length);
		
	//	System.out.println(a[0]);//read specific value
		
	//	for (int i=0;i<=a.length; i++)
		//System.out.println(a[i]);
		
		//multi-dimensional array
		//int a[][]=new int[3][2];
		int a[][]= {{100,200},{300,400},{500,600}};
		System.out.println("The length of the row is= "+a.length);
		System.out.println("Then number of Coulumns is= "+a[0].length);
	/*for (int i=0;i<=a.length;i++)//rows
	{
		for (int j=0;j<a[i].length;j++)//Columns
		{
			System.out.println(a[i][j]);
		}*/
		
		for (int r[]:a) 
		{
			for (int i:r)
			{System.out.println(i);
		}
		}
	}
}