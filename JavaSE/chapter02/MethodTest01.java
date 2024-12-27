import java.util.Scanner;

public class MethodTest01 {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		login();
		
	}
	
	public static boolean isPrimeNumber(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++)	{
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void login() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter your username: ");
			String username = sc.next();
			System.out.print("Enter your password: ");
			String password = sc.next();
			
			if (checkLogin(username, password))	{
				System.out.println("Login Success!");
				return;
			} else {
				System.out.println("Wrong username and password! Please entry again!");
			}
		}
	}
	
	public static boolean checkLogin(String username, String password) {
		return "admin".equals(username) && "abc123".equals(password);
	}
}