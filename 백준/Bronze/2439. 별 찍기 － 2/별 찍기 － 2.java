import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = s; j > 0; j--) {
				System.out.print(" ");
			}
			for (int y = i; y > 0; y--) {
				System.out.print("*");
			}
			System.out.print("\n");
			s--;
		}
	}
}