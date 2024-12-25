import java.util.Scanner;

public class LoopTest02 {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0)	{
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	/*
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0)	{
					flag = false;
				}
			}
			if (flag) {
				System.out.print(i + " ");
				count += 1;
				if (count % 8 == 0)	{
					System.out.println();
				}
			}
		}
	}
	*/
	
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if ((i & 1) == 1) {
				result += i;
			} else {
				result -= i;
			}
		}
		System.out.println("result = " + result);
	}
	*/
	
	/*
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 1000; i++)	{
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print(i + " ");
				count += 1;
				if (count % 5 == 0)	{
					System.out.println();
					count = 0;
				}
			}
			
		}
	}
	*/
	
	/*
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int result = 0;
			result += (Math.pow(i % 10, 3));
			result += (Math.pow(i / 10 % 10, 3));
			result += (Math.pow(i / 100 % 10, 3));
			
			if (result == i) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	*/
	
	/*
	public static void main(String[] args) {
		int lastNum = 0;
		for (int i = 2; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0)	{
					flag = false;
				}
			}
			if (flag) {
				if (i - lastNum == 2 && lastNum != 0) {
					System.out.println("(" + lastNum + ", " + i + ")");
					
				} 
				lastNum = i;
			}
		}
		System.out.println();
	}
	*/
	
	/*
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++)	{
				// space
				System.out.print(" ");
			}
			for (int j = 0; j < 9 - 2 * i; j++)	{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	*/
	
	/*
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)	{
			for (int j = 0; j < 4 - i; j++)	{
				System.out.print(" ");
			}
			for (int j = 0; j < 8; j++)	{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	*/
}