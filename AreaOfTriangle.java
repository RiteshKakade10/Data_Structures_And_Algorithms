import java.util.*;
import java.io.*;
class AreaOfTriangle
{
	public void AreaOfTriangle1(float base,float height){
		double Ans1=((0.5)*base*height);
		System.out.println("Area Of Triangle:"+Ans1);

	}
	public static void main(String[] args) {
		AreaOfTriangle obj1=new AreaOfTriangle();		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Height of Triangle:");
		float base=sc.nextFloat();
		System.out.print("Enter Base Of Triangle:");
		float height=sc.nextFloat();

		obj1.AreaOfTriangle1(base,height);
		
		
	}
}

/*
Area Of Triangle 

#Formula#
AOT=(0.5)*base*height;
*/