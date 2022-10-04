import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int s = 0, c = 1;

		while (true) {

			if (n <= s + c) {

				if (c % 2 == 1) {

					System.out.println((c - (n - s - 1)) + "/" + (n - s));
					break;
				} else {
					System.out.println((n - s) + "/" + (c - (n - s - 1)));
					break;
				}
			} else {
				s += c;
				c++;
			}
		}
	}
}