package practice19;

import java.math.BigDecimal;
import java.util.Scanner;
/**
 * 四舍五入取整
 * @author leleqin
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int lie = (int)Math.round(n * 0.5);
		for (int i = 0; i < lie; i++) {
			System.out.print(s);
			for (int j = 1; j < n; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}

}
