package practice11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		double result = (h - 100) * 0.9 * 2;
		System.out.printf("%.1f",result);
	}

}
