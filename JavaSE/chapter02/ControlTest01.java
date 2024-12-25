import java.util.Scanner;

public class ControlTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (score >= 60)	{
			System.out.println("Congratulation! You pass the exam!");
		} else {
			System.out.println("Oh no, You fail the exam!");
		}
	}
}