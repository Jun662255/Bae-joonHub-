import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i = 0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		int s = sc.nextInt();
		int num = 0;
		for(int i = 0; i<a; i++) {
			if(arr[i] == s) {
				num += 1;
			}
		}
		System.out.println(num);
	}
	
}
