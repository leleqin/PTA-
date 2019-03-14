package practice9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = 0;
		int[] arr = new int[n];
		int OddCount = 0;
		int EvenCount = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				EvenCount++;
			}else {
				OddCount++;
			}
		}
		System.out.println(OddCount+" "+EvenCount);
	}

}
