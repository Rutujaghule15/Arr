//WAJP to check if the array is the palindrom which works both letters and numb
import java.util.*;
class Palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

        System.out.println("Enter the array elements : ");
        char [] arr = new char[size];
        for(int i=0;i<size;i++) 
		{
			arr[i] = sc.next().charAt(0);
		}

		char [] reverseArray = new char[size];
		int temp=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			reverseArray[temp] = arr[i];
			temp++;
		}

		if(Arrays.equals(arr,reverseArray))
		{
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}

	}
}