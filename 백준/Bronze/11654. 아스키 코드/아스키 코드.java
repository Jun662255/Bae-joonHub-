import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		byte[] b = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(b[0]);
	}
}