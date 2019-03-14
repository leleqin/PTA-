package practice7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = 1;
		int s = 0;
		if(n == 0) {
			System.out.println(0);
		}
		else {
			for (int j = 1; j <= n; j++) {
				m = m*j;
				s += m;
		}
		System.out.println(s);
		}
	}

}
