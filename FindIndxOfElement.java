import java.util.*;
class FindIndxOfElement
{
	static int arr []={5,7,2,9,1}; 
	int element ;
	public static void main(String[] args) {
		
		System.out.println(findIndex(7));
	}

	public static int findIndex(int element)
	{
		for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i] == element)
	    	{
	    		//System.out.println("Element at index : "+i);
	    		return i;
	    	}
	    }
	    return -1;
	}
}