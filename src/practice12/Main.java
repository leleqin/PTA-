package practice12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(scan.hasNext()) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			double standerd = (h - 100) * 0.9 * 2;
			if (Math.abs(w - standerd) < standerd * 0.1) {
				System.out.println("You are wan mei!");
			}else if(w - standerd < standerd * 0.1) {
				System.out.println("You are tai shou le!");
			}
			else {
				System.out.println("You are tai pang le!");
			}
		}
	}
}
