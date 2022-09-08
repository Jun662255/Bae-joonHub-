import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = null;
		for(int i = 1; i<= n ; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int  a = Integer.parseInt(st.nextToken());
			int  b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+i+": " + a + " + " + b + " = " + (a+b) +"\n");
			
		}	
			br.close();
			
			bw.flush();
			bw.close();
	}
}