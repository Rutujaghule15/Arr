import java.util.*;
class CountNumInArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

        System.out.println("Enter the array : ");
        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the num to get the count : ");
		int num = sc.nextInt();

		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]== num)
			{
				count++;
			}
			
		}
		System.out.println("Count is : "+count);

	}
}
