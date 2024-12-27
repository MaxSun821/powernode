import java.util.Scanner;

public class LoopTest03 {
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int enterNum = -1;
		while (enterNum != 0) {
			enterNum = sc.nextInt();
			if (enterNum > 0) {
				sum += enterNum;
			}
		}
		System.out.println("The result is " + sum);
	}
	*/
	
	/*
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 3) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	*/
	
	public static void main(String[] args) {
		int soldiers = 1;
		while(!(soldiers % 3 == 2 && soldiers % 5 == 3 && soldiers % 7 == 4)) {
			soldiers++;
		}
		System.out.println("Has " + soldiers + " soldiers.");
	}
}