class FindElementsInArray
{
	public static void main(String[] args) {
		int arr [] = {9,3,7,8,1,4,8};
		int key = 1,i;
		boolean flag =false;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
	    {
	    	System.out.println("Element Found At Index : "+i);
	    }
	    else
	    {
	    	System.out.println("Element not found ");
	    }
		
	}
}



/* 
boolean flag = true;
		int i;
		for(i=0;i<arr.length;i++){
			if(arr[i] == key)
			{
				System.out.println(arr[i]+" at position "+(i+1));
				flag = false;
				break;
			}
		}
	// 	if(flag)
	// 	    System.out.println(key+" Key is not found");
	// }
		if(i== -1){
		    System.out.println(key+" Key is not found");  */