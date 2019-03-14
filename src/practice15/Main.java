package practice15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 1;
		while(scan.hasNext()) {
			if(scan.nextInt() != 250) {
				count++;
			}else {
				System.out.println(count);
				break;
			}
		}
	}

}
