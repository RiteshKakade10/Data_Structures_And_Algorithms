class SwappingWithoutUsingThreeNum
{
	public static void main(String[] args) {
		int a=5;
		int b=6;
		System.out.println("Before Swapping Values:a:"+a+" b:"+b);
		a=a+b;

		b=a-b;

		a=a-b;

		System.out.println("After Swapping Values:a:"+a+" b:"+b);
		
	}
}