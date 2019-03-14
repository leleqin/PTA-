package practice14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(scan.hasNext()) {
			String sex = scan.next();
			double height = scan.nextDouble();
			if(sex.equals("M")) {
				System.out.printf("%.2f",(height / 1.09));
				System.out.println();
			}else if(sex.equals("F")) {
				System.out.printf("%.2f",(height * 1.09));
				System.out.println();
			}
		}
	}

}
