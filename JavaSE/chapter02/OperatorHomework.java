public class OperatorHomework {
	// public static void main(String[] args) {
		// double pi = 3.14;
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// System.out.print("Enter a radius:> ");
		// double radius = sc.nextDouble();
		
		// System.out.println("Area: " + (pi * radius * radius) + ", Circumference:" + (pi * 2 * radius));
	// }
	/*
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		int c = 10;
		
		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println(max);
	}
	*/
	//public static void main(String[] args) {
	// 	int n = 11;
	// 	if ((n & 1) == 0) {
	// 		System.out.println(n + " is an even");
	//	}
	//}
	
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if (num1 > 0 && num2 < 10 && (num3 & 1) == 0) {
			System.out.println("complete all the details");
		} else {
			System.out.println("rule isn't all correspond.");
		}
	}
	
	/*
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter a year:> ");
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}
	*/
}