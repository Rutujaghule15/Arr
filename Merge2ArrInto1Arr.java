//WAJP to merge 2 arrays into 1 single array.
import java.util.*;
class Merge2ArrInto1Arr
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size1: ");
		int size1 = sc.nextInt();

        System.out.println("Enter the array1 : ");
        int [] arr1 = new int[size1];
        for(int i=0;i<size1;i++) //FOR 1D ARRAY
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Array 1 : "+Arrays.toString(arr1));

		System.out.println("Enter the size2: ");
		int size2 = sc.nextInt();

        System.out.println("Enter the array2 : ");
        int [] arr2 = new int[size2];
        for(int i=0;i<size2;i++) //FOR 1D ARRAY
		{
			arr2[i] = sc.nextInt();
		}
		System.out.println("Array 2 : "+Arrays.toString(arr2));
		

		 int [] mergedArray = new int[size1+size2];


		 for(int i=0;i<size1;i++)
		 {
		 	mergedArray[i] = arr1[i];
		 }
		 for(int i=0;i<size2;i++)
		 {
		 	mergedArray[size1+i] = arr2[i];
		 }

		 System.out.println("Merged Array : "+Arrays.toString(mergedArray));
	}
}