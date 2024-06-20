//WAJP to sort the elements in ascending order
import java.util.*;
class SortElementInAscending
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

        System.out.println("Enter the array : ");
        int [] arr = new int[size];
        for(int i=0;i<size;i++) 
		{
			arr[i] = sc.nextInt();
		}

		int temp=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
			System.out.print(Arrays.toString(arr));

		
		
	}
}
//WAJP to fetch the second smallest element in the array
// WAJP to fetch second largest element in the array