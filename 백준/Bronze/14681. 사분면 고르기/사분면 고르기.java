import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    
	    if(A > 0 && B > 0)
	    	System.out.println("1");
	    if(A < 0 && B > 1)
	    	System.out.println("2");
	    if(A < 0 && B < 0)
	    	System.out.println("3");
	    if(A > 0 && B < 0)
	    	System.out.println("4");
    }
}