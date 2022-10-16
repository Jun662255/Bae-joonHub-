import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int s = 0;
		int n = 0;
		int sum = 0;
		int min_value = 0;

		for (int i = min; i <= max; i++) {
			if (i != 1) {
				for (int j = 2; j <= (int) Math.sqrt(i); j++) {
					if (i % j == 0) {
						s += 1;
					}
				}
				if (s == 0) {
					sum += i;
					n += 1;
					if (n == 1)
						min_value = i;
				}
				s = 0;
			}
		}
		System.out.println(sum != 0 ? sum + "\n" + min_value : -1);
	}
}