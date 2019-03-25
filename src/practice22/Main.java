package practice22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] sex = new int[n];
		String[] name = new String[n];
		int i = 0;
		while(scan.hasNext()) {
			sex[i] = scan.nextInt();
			name[i] = scan.next();
			i++;
			if(i > n)
				break;
		}
		for (int j = 0; j < n; j++) {
			System.out.print(sex[j]+",");
			System.out.print(name[j]+",");
		}
	}

}
