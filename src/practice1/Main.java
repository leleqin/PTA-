package practice1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		while(n!=1) {
			if(n % 2 == 0) {
				n = n / 2;
				count++;
			}
			else {
				n = (3 * n + 1)/2;
				count++;
			}
		}
		System.out.println(count);
	
	}

}
