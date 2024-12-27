import java.util.Scanner;

public class MethodTest02 {
	public static void main(String[] args) {
		/*
		int recursionSum = recursion(5);
		System.out.println("five's recursion result is " + recursionSum);
		*/
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int rabbits = rabbit(month);
		
		System.out.println(month + " months after, there will have " + rabbits + " rabbits");
	}
	
	public static int recursion(int number) {
		if (number == 1) {
			return 1;
		}
		return number + recursion(number - 1);
	}
	
	public static int rabbit(int month) {
		if (month == 1 || month == 2)	{
			return 1;
		}
		return rabbit(month - 1) + rabbit(month - 2);
	}
}