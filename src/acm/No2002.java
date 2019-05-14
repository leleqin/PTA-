package acm;

import java.util.Scanner;

/**
 * 计算球体积
 * @author leleqin
 *
 */
public class No2002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			double r = scan.nextDouble();
			double PI = 3.1415927;
			double result = ((double)4 / (double)3) * PI * Math.pow(r, 3);
			System.out.printf("%.3f",result);
			System.out.println();
		}
	}

}
