
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int c = n;

		for (int i = 0; i < n; i++) {
			String st = sc.next();
			boolean test[] = new boolean[26];

			for (int j = 0; j < st.length() - 1; j++) {
				if (st.charAt(j) != st.charAt(j + 1)) {
					if (test[st.charAt(j + 1) - 97] == true) {
						c--;
						break;
					}
				}
				test[st.charAt(j) - 97] = true;

			}
		}
		System.out.println(c);
	}
}