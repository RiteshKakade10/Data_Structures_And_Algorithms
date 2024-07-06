class SwappingUsingTwoNumBinary
{
	public static void main(String[] args) {
		int a=5;
		int b=7;
		System.out.println("Before Swapping Values:"+"A:"+a+" B:"+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping Values:"+"A:"+a+" B:"+b);	
	}
}
