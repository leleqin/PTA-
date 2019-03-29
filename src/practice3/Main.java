package practice3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int i = 1;
		while(scan.hasNext()) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			long c = scan.nextLong();
			if(a + b > c) {
				System.out.println("Case #" + i + ": true");
			}else{
				System.out.println("Case #" + i + ": false");
			}
			i++;
		}

	}

}
