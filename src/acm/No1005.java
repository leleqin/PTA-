package acm;

import java.util.Scanner;

/**
 * Number Sequence
 * 
 * @author leleqin
 *
 */
public class No1005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();
			if (a != 0 && b != 0 && n != 0)
				System.out.println(sequence(a, b, n));
			else
				System.exit(1);
		}
	}

	public static int sequence(int a, int b, int n) {
		// mod 7 到最后只有49种可能，如果不加这个会导致内存超出限制
		if (n > 49) {
			n %= 49;
		}
		if (n == 1 || n == 2)
			return 1;
		return (a * sequence(n - 1, a, b) + b * sequence(n - 2, a, b)) % 7;
	}

}
