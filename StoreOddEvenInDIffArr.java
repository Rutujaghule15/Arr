import java.util.*;
class StoreOddEvenInDIffArr
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

        System.out.println("Enter the array : ");
        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++) //FOR 1D ARRAY
		{
			arr[i] = sc.nextInt();
		}


		int evenCount = 0;
		int oddCount = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else{
				oddCount++;
			}
		}

		int[] evenArray = new int[evenCount];
		int[] oddArray = new int[oddCount];

		int itt1 = 0;
		int itt2= 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenArray[itt1++] = arr[i];
			}
			else{
				oddArray[itt2++] = arr[i]; 
			}
		}

		System.out.println("Even Array : "+Arrays.toString(evenArray));
		System.out.println("Odd Array : "+Arrays.toString(oddArray));


	}
}

