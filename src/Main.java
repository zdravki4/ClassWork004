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
				System.out.println("������� � �����.");
			} else 
			{
				System.out.println("������� �� � �����.");
			}
		}else if (numInt > 5 && numInt <= 15) 
		{
			if (numInt %3 == 0) 
			{
				System.out.println("������� �� ���� �� 3 ��� �������.");
			} else {
				System.out.println("������� �� �� ���� �� 3 ��� �������.");
			}
		}else {
			if (numInt == 0) {
				System.out.println("������� � ���� ");
			}else if (numInt < 0) {
				System.out.println("������� � �����������.");
			}else {
				System.out.println("������� � �����������.");
			}
		}

	}
	
}

