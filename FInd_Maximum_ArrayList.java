import java.util.*;
class FInd_Maximum_ArrayList
{
	public static int Maximumelement(ArrayList<Integer> list1)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<list1.size();i++)
		{
			if(list1.get(i)>max)
			{
				max=list1.get(i);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(10);
		list1.add(7);
		list1.add(2);
		list1.add(5);
		System.out.println(Maximumelement(list1));
	}
}