package acm;

import java.util.Scanner;

/**
 * 计算两点间的距离
 * @author leleqin
 *
 */
public class No2001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			double x1 = scan.nextDouble();
			double y1 = scan.nextDouble();
			double x2 = scan.nextDouble();
			double y2 = scan.nextDouble();
			double x = Math.pow((x1-x2), 2);
			double y = Math.pow((y1-y2), 2);
			double d = Math.sqrt(x+y);
			System.out.printf("%.2f",d);
			System.out.println();
		}
	}

}
