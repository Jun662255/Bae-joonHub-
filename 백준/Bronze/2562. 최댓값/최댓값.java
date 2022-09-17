import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new  int[9];
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		int c = 0;
		int max = 0;
		int index = 0;
        
		for(int value : arr) {
			c++;
            
			if(value > max) {
				max = value;
				index = c;
			}
		}
		System.out.print(max + "\n" + index);
		
	}
}