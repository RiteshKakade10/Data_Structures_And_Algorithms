import java.util.*;
class Swapping_ArrayList_Elements
{
	public static ArrayList<Integer> Swapping_ArrayList_Elements1(ArrayList<Integer> l1,int ind1,int ind2)
	{
		for (int i=0;i<l1.size();i++) {
			int temp=l1.get(ind1);
			l1.set(ind2,l1.get(ind1));
			l1.set(ind1,temp);
		}
		return l1;
	}
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		System.out.println("Before Swapping the elements in the arraylist:"+l1);
		System.out.println("After Swapping array elements:"+Swapping_ArrayList_Elements1(l1,1,3));
	}
}