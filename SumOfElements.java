import java.util.Arrays;
import java.util.Scanner;
class SumOfElements
{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

		System.out.println("Enter the elemnts : ");
		int [] arr = new int[size];

        int sum=0,count=0;
        float avg=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			count ++;
			sum+=arr[i];
			avg = sum/count;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum : "+sum);
		System.out.println("Average : "+avg);
	}
}
















/* 
Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

		System.out.println("Enter the array : ");
		int [] arr = new int[size];

        int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of Elements : "+sum);

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
*/