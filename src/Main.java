import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter an integer number: ");
		int numInt = input.nextInt();
		
		if (numInt>0 && numInt<=5) 
		{
			if (numInt %2 == 0) 
			{
				System.out.println("Числото е четно.");
			} else 
			{
				System.out.println("Числото не е четно.");
			}
		}else if (numInt > 5 && numInt <= 15) 
		{
			if (numInt %3 == 0) 
			{
				System.out.println("Числото се дели на 3 без остатък.");
			} else {
				System.out.println("Числото не се дели на 3 без остатък.");
			}
		}else {
			if (numInt == 0) {
				System.out.println("Числото е нула ");
			}else if (numInt < 0) {
				System.out.println("Числото е отрицателно.");
			}else {
				System.out.println("Числото е положително.");
			}
		}

	}
	
}

