class ArrayUsingForEach
{
	public static void main(String[] args) {
		 //int [][] a = {{10,20,30},{40,50},{60,70,80}};
		// for(int [] i: a)
		// 	for(int j : i)
		// 		System.out.println(j);

		// int [][][] a = {{{10,20},{30}},{{40,50,60}}};
		// for(int [][] i: a)
		// {
		// 	for(int []j : i){
		// 		for(int k : j)
		// 		{
		// 			System.out.print(k+" ");
		// 		}
		// 		System.out.println();
		// 	}
		// }

		// int [][][] a = {{{10,20},{30}},{{40,50,60}}};
		// int i = 0;
		// while(i<a.length)
		// {
		// 	int j = 0;
		// 	while(j<a[i].length)
		// 	{
		// 		int k=0;
		// 		while(k<a[i][j].length)
		// 		{
		// 			System.out.println(a[i][j][k]+" ");
		// 			k++;
		// 		}
		// 		j++;
		// 	}
		// 	i++;
		// } 
		int [][][] a = {{{10,20},{30}},{{40,50,60}}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}
}