import java.util.Scanner;

class FactorialOfNumber
{
	public static void main(String[] args) 
	{
		int n,fact=1;
		System.out.println("Enter the Number");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}

		System.out.println("Factorial of number is:"+fact);
	}
}	
