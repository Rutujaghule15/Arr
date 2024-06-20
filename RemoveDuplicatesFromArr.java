import java.util.Arrays;
class RemoveDuplicatesFromArr
{
	public static void main(String[] args) {
		int arr[] = {2,6,4,3,2,6,7};
		int removedup [] = new int[]
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					break;
			        //System.out.print(arr[j]+" ");

				}
				continue;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
/* 
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        // Remove duplicates
        int[] resultArray = removeDuplicates(array);

        // Print the array without duplicates
        System.out.println("Array without duplicates: " + Arrays.toString(resultArray));
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        if (n == 0) {
            return new int[0];
        }

        // Create a temporary array to store unique elements
        int[] tempArray = new int[n];
        int j = 0;

        // Traverse the array and add unique elements to tempArray
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (array[i] == tempArray[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempArray[j++] = array[i];
            }
        }

        // Create the final array with the correct size
        int[] resultArray = new int[j];
        for (int i = 0; i < j; i++) {
            resultArray[i] = tempArray[i];
        }

        return resultArray;
    }
}


*/