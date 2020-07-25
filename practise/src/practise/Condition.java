package practise;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter y/n");
		char resp = s1.nextLine().charAt(0);
		if(resp=='y')
		{
			System.out.println("Yes");
		}
		else if(resp=='n')
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("other");
		}
		s1.close();
	}

}
