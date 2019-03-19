package practice18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] testNumber = new String[n];
		int[] testSeatNumber = new int[n];
		int[] examSeatNumber = new int[n];
		for (int i = 0; i < n; i++) {			
			testNumber[i] = scan.next();
			testSeatNumber[i] = scan.nextInt();
			examSeatNumber[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		while(scan.hasNext()) {
			int a = scan.nextInt();
			for (int i = 0; i < n; i++) {
				if(testSeatNumber[i] == a) {
					System.out.println(testNumber[i] + " " + examSeatNumber[i]);
				}
			}
		}

		
	}

}
