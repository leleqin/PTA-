package practice5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = 0;
		int count = 0;
		for (int i = a; i <= b; i++) {
			System.out.printf("%5d",i);
			count++;
			if(count % 5 == 0 || count == b-a+1) {
				System.out.println();
			}
		}
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		
		System.out.println("Sum = " + sum);
	}

}
