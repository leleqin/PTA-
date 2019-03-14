package practice13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		double result;
		try {
			result = (double)a / b;
			if (b > 0) {
				System.out.printf(a +"/" + b + "=" + "%.2f",result);
			}else if(b < 0) {
				System.out.printf(a + "/(" + b + ")=" + "%.2f",result);
			}else{
				System.out.println(a + "/" + b + "=Error");
			}
		} catch (Exception e) {
			System.out.println(a + "/" + b + "=Error");
		}
		
	}
}
