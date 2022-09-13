import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.print((n1 + n2) + "\n");
				
		}
		sc.close();
	}
}