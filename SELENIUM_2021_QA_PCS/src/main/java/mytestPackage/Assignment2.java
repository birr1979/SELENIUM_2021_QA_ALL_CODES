package mytestPackage;

public class Assignment2 {

	public static void main(String[] args) 
	{
		// Assignment #1 check if positive or negative
			int Number=0;
			if (Number >0)
			{
				System.out.println(Number + "  is Positive Number");
			}
			else if(Number <0)
			{
				System.out.println(Number + "  is Negative Number");
			}
			else
			{
				System.out.println(Number +"  is Neither Positive nor Nagative");
			}
			
			
			//assignment #2 nested if find the greatest number 
			
			int a , b , c;
			a=4;
			b=1; 
			c=0;
			if (a>b && a>c)
			{
				System.out.println(a + " is the Greatest number");
				
			}
				else if (b>a && b>c) 
				{
						
					System.out.println(b + " is the Greatest Number");
				}
				
				else
				{
					System.out.println(c + " is the Greatest Number");
				}
					
			//Assignment #3 count the number of digit
			
				int n;
				n=122378;
				int count = 0;
				  if (n >= 1) ++count;

				  while (n / 10 >= 1)
				  {
				    n /= 10;
				    ++count;
				  }

				  	System.out.println(count);
				}


			
			
			}

