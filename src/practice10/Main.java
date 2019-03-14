package practice10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 2; j < arr[i]; j++) {
				if(arr[i] % j == 0) {
					System.out.println("No");
					flag = false;
					break;
				}
			}
			if(flag && arr[i] != 1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		}
	}

