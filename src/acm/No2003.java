package acm;

import java.util.Scanner;

/**
 * 求绝对值
 * @author leleqin
 *
 */
public class No2003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			double result = scan.nextDouble();
			System.out.printf("%.2f",Math.abs(result));
			System.out.println();
		}

	}

}
