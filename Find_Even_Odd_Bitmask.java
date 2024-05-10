class Find_Even_Odd_Bitmask
{
	public static String Even_Odd(int num)
	{
		int bitmask=1;
		if((num & bitmask)==0)
		{
			return "Even";
		}
		else
		{
			return "Odd";
		}
		
	}

	public static void main(String[] args) {
		System.out.println(Even_Odd(4));
	}
}