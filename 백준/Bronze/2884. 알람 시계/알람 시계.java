import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int H = sc.nextInt();
	    int M = sc.nextInt();
	    int m = M-45;
	    
	    if(m < 0 ) {
	    	H -= 1;
	    	m = m +60;
	    	if(m == 60) {
	    		m = 0;
	    	}
	    	if(H < 0) {
	    		H += 24;
	    	}
	    }
	    
	    System.out.println(H);
	    System.out.println(m);
    }
}