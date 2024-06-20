//WAJP to fetch the -ve numbers in an array
class FetchNegativeNum
{
	public static void main(String[] args) {
		int arr[] = {1,-2,4,-6,-78,56,841,-54};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
//WAJP to reverse the elements in an array