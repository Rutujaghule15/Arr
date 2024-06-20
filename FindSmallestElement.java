import java.util.*;
class FindSmallestElement
{
	public static void main(String[] args) {
		int a[]  ={2,3,5,7,9,1};
		//int min = Integer.MAX_VALUE;
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min = a[i];
			}
			
		}
		System.out.println(min);
	}
}