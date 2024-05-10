class Reverse_Integer
{
	public static int Find_Reverse_Integer(int num)
	{
		int rev=0,rem=0;
		while(num!=0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		
		System.out.println(Find_Reverse_Integer(123));
	}
}