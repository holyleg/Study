public class J2
{
	public static void main(String[] args)
       	{
		int sum = 0;
		int i = 0; 

		System.out.println("0부터 시작하여 99까지의 짝수들의 합을 구하시오\n");
		while(i < 100 - 1)
	       	{
			i++;
			if((i % 2) == 0)
			{
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println(sum);

		sum = 0;
		i = 0;

		do
		{	
			i++;
			if ((i % 2) == 0) sum += i;
		}while(i < 100 - 1);

		System.out.println(sum);

		sum = 0;
		i = 0;

		for(i = 0; i < 100; i++)
		{
			if ((i % 2) == 0)sum += i;
		}

		System.out.println(sum);



	}
}
