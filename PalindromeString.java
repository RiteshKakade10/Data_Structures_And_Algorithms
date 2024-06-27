import java.util.*;
class PalindromeString
{
	public static String Palindrome(String str1)
	{
		int n=str1.length();
		for(int i=0;i<n/2;i++)
		{
			if(str1.charAt(i)!=str1.charAt(n-i-1))
			{
				return "Not Palindrome";
			}
		}
		return "Palindrome";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		System.out.println(Palindrome(str1));
		
	}
}
