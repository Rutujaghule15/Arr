import java.util.Scanner;
import java.util.Arrays;
class FruitStore
{
	String fruits[];
	static Scanner sc=new Scanner(System.in);

	public void storeFruits(String fruits[])
	{
		this.fruits = fruits;
		for(int i=0;i<fruits.length;i++)
		{
			fruits[i] = sc.next();
		}
	}
	public void displayFruits()
	{
		System.out.println(Arrays.toString(fruits));
	}

    public void changeFruit()
    {
    	System.out.println("Enter the fruits : ");
    	String inputFruit = sc.next();

    	for(int i=0;i<fruits.length;i++)
    	{
    		if(inputFruit.equals(fruits[i]))
    		{
    		    System.out.println("Match input : ");
                System.out.println("Enter new fruit : ");
                String newFruit = sc.next();
    			fruits[i] = inputFruit;
    			break;
    		}
    	}
    }
	public static void main(String[] args) {
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

		String [] fruits = new String[size];
		FruitStore f=new FruitStore();
	    f.storeFruits(fruits);
	    f.displayFruits();
	    f.changeFruit();
	}
}