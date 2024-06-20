import java.util.*;
class SumProduct
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int row = sc.nextInt();
		System.out.print("Enter the column : ");
		int column = sc.nextInt();

		System.out.println("Enter the Array : ");
		int[][] arr = new int[row][column];

        int sum=0;
        int prod=1;
		// for(int i=0;i<arr.length;i++) //FOR 1D ARRAY
		// {
		// 	arr[i] = sc.nextInt();
		// 	sum = sum+arr[i];
		// 	prod = prod*arr[i];
		// }

		//FOE 2-D ARRAY
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j]+" ");
			    sum = sum+arr[i][j];
			    prod = prod*arr[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum : "+sum);
		System.out.println("Product : "+prod);
	}
}

