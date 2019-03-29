package practice2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1 = n/100;   //百位
		System.out.println(a1);
		int a2 = n%100/10;   //十位
		System.out.println(a2);
		int a3 = n%10;    //个位
		System.out.println(a3);
		while(a1 > 0){
			System.out.print("B");
			a1--;
		}
		while(a2 > 0){
			System.out.print("S");
			a2--;
		}
		for(int i = 1 ;i <= a3;i++){
			System.out.print(i);
		}
		System.out.println();
		

	}

}
