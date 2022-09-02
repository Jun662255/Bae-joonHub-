import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String A = sc.next();
    	String B = sc.next();
    	String B1 = B.substring(2);
    	String B2 = B.substring(1,2);
    	String B3 = B.substring(0,1);
    	System.out.println(Integer.parseInt(A)*Integer.parseInt(B1));
    	System.out.println(Integer.parseInt(A)*Integer.parseInt(B2));
    	System.out.println(Integer.parseInt(A)*Integer.parseInt(B3));
    	System.out.println(Integer.parseInt(A)*Integer.parseInt(B));
    	
    }
}