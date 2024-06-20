import java.util.*;
class SecondLargestElement
{
	public static void main(String [] args)
	{
		int [] arr= {3,7,8,1,6,-2};
		int temp=0;
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

	        }

	    }
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(Arrays.toString(arr));
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[1]); */


		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i]>secondMax && max !=arr[i])
			{
				secondMax = arr[i];
			}
		}
		System.out.println(secondMax);
	}
}