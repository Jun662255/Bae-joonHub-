
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 1;
		int b = 2;

		if (n == 1) {
			System.out.println(1);
		} else {
			while (b <= n) {
				b = b + (6 * a);
				a++;
			}
			System.out.println(a);
		}
	}
}