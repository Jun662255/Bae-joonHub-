import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int a = 0; a < n; a++) {
			String s = sc.next();
			char s1 = s.charAt(0);
			char s2 = s.charAt(s.length() - 1);
			String result = String.valueOf(s1) + String.valueOf(s2); 
			System.out.println(result);
			
		}
	}
}
