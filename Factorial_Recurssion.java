import java.util.*;
class Factorial_Recurssion
{
	public static int Factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int fnm1=Factorial(n-1);
		int fn=n*fnm1;
		return fn;
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number:");
		int n=sc.nextInt();
		System.out.println(Factorial(n));
		
	}
}