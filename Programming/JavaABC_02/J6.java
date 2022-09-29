import java.util.Scanner;

public class J6{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[10];
		System.out.println("양수 10개를 입력하시오.");
		for(int i = 0; i < 10; i++)
		{
			intArray[i] = scanner.nextInt();
		}	




		for(int j = 0; j < 10; j++)
		{

			if((intArray[j] % 5) == 0)
			{
				System.out.println(intArray[j]);
			}
		}
	}
}
		
