package practice16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] date = scan.next().split("-");
		System.out.println(date[2] + "-" + date[0] + "-" + date[1]);

	}

}
