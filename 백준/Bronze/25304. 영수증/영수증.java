import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int s2 = 0;
		for(int i = 1; i<=n; i++) {
			int p = sc.nextInt();
			int pn = sc.nextInt();
			
			int s1= p*pn;
			s2 += s1;
			
		}
		if(x == s2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
			
		}
		
	}
}