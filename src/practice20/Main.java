package practice20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = scan.nextInt();
		int a1,a2,b1,b2,count1 = 0,count2 = 0;
		while(scan.hasNext()) {
			a1 = scan.nextInt();
			a2 = scan.nextInt();
			b1 = scan.nextInt();
			b2 = scan.nextInt();
			if(a1 + b1 == a2 && a1 + b1 != b2) {
				count1++;
				if(count1 > a) {
					System.out.println("A");
					System.out.println(count2);
					break;
				}
			}else if(a1 + b1 == b2 && a1 + b1 != a2) {
				count2++;
				if(count2 > b) {
					System.out.println("B");
					System.out.println(count1);
					break;
				}
			}
		}
	}
}
