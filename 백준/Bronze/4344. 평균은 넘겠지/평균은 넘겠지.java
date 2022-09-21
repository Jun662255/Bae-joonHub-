
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		
		int t = sc.nextInt(); 

		for (int i = 0; i < t; i++) {

			int n = sc.nextInt();
			arr = new int[n];

			double s = 0;

			for (int j = 0; j < n; j++) {
				int val = sc.nextInt();
				arr[j] = val;

				s += val;
			}
			double mean = (s / n);
			double count = 0;

			for (int j = 0; j < n; j++) {
				if (arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count / n) * 100);
		}

	}
}