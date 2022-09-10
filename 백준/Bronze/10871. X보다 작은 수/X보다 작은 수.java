import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int[] n3 = new int[n1];
		for (int i = 0; i < n1; i++) {
			n3[i] = sc.nextInt();
		}
		for (int j = 0; j < n1; j++) {
			if (n3[j] < n2)
				System.out.print(n3[j] + " ");
		}
	}
}