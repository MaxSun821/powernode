import java.util.Scanner;

public class LoopTest01 {
	/*
	public static void main(String[] args) {
		for(int i = 100; i > 0; i -=3) {
			System.out.println(i);
		}
	}
	*/
	
	/*
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < 100; i += 2) {
			sum += i;
		}
		System.out.println("The odd's sum of 1-100 is: " + sum);
	}
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ret = 1;
		for(int i = n; i > 1; i--) {
			ret *= i;
		}
		System.out.println("Factorial of " + n + " is: " + ret);
	}
}