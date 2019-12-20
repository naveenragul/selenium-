import java.util.Scanner;

public class basics {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.print("enter a num");
		int a=input.nextInt();
		int b=20;
	add(a,b);
	
		
	}
	
	public static void add(int a, int b)
	{
	int c=a+b;
	System.out.print("output is" +c);
	
	}

}
