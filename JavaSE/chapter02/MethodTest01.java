import java.util.Scanner;

public class MethodTest01 {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String username = sc.next();
		System.out.print("Enter your password: ");
		String password = sc.next();
		
		while (!login(username, password)) {
			System.out.println("Wrong username and password! Please entry again!");
			System.out.print("Enter your username: ");
			username = sc.next();
			System.out.print("Enter your password: ");
			password = sc.next();
		}
		System.out.println("Login Success!");
	}
	
	public static boolean isPrimeNumber(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++)	{
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean login(String username, String password) {
		if ("admin".equals(username) && "abc123".equals(password)) {
			return true;
		}
		return false;
	}
}