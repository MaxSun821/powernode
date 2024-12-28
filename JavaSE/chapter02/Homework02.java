public class Homework02 {
	/*
	public static void main(String[] args) {
		int peaches = 1;
		for (int i = 1; i < 10; i++) {
			peaches = (peaches + 1) * 2;
		}
		System.out.println("There are " + peaches + " peaches before.");
	}
	*/
	/*
	public static void main(String[] args) {
		int bigMonk = 100;
		int littleMonk = 0;
		while (true) {
			if ((bigMonk * 3 + littleMonk / 3) == 100) {
				break;
			}
			bigMonk--;
			littleMonk++;
		}
		System.out.println("There has " + bigMonk +" big monts, and " + littleMonk + " little monks");
	}
	*/
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j <= 33; j++) {
				int k = 100 - i - j;
				if (k % 3 == 0)	{
					if ((5 * i + 3 * j + k / 3) == 100)	{
						count++;
					}
				}
			}
		}
		System.out.println("There has " + count + " schemes.");
	}
}