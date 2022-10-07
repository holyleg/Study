import java.util.Scanner;


interface University {
	final int studentNum = 2000;

	void studentNumberPrint();
	void studentIdPrint(int IdNum);
	void studentNamePrint(String name);
	
	default void printUnivName() {
		System.out.println("영남대");
	}
}

class computerEnginnering implements University{
	@Override
	public void studentNamePrint(String name)
	{
		System.out.println(name);
	}
	
	@Override
	public void studentIdPrint(int IdNum)
	{
		System.out.println(IdNum);
	}

	@Override
	public void studentNumberPrint() {
		System.out.println(studentNum);
	}

}



public class praice_1_20221007 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "UTF-8");

		computerEnginnering com = new computerEnginnering();
		com.studentNamePrint(scanner.next());
		com.studentIdPrint(21611701);
		com.studentNumberPrint();

		scanner.close();
	}
}
