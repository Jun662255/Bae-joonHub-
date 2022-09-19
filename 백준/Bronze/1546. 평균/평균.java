import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		double avg = 0;
		double[] score = new double[num];
		for (int i = 0; i < num; i++) {
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);
		double max = score[score.length-1];
		
		for (int i = 0; i < num; i++) {
			avg  += score[i] / max * 100;
		}
		System.out.println(avg/num);
	}
}