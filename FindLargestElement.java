import java.util.*;
class FindLargestElement
{
	public static void main(String[] args) {
		int arr[] = {8,5,3,6,1,9};
		int max = arr[0];
		//int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("Largest Element : "+max);


		// FIND SMALLEST ELEMENTS
		int min = arr[0];
		//int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("Smallest Element : "+min);
	}
}