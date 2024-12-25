import java.util.Scanner;

public class ControlTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] monthOfDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.print("Enter a month: ");
		int month = sc.nextInt();

		boolean isLeapYear = isLeapYear(year);
		if(isLeapYear && month == 2) {
			monthOfDay[month] = 29;
		} 
		System.out.println(year + "-" + month + " has " + monthOfDay[month] + " days");

	}
	public static boolean isLeapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}
}