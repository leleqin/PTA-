package practice2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1 = n/100;   //百位
		int a2 = n%100/10;   //十位
		int a3 = n%10;    //个位
		while(a1>0){
			System.out.print("B");
			a1--;
		}
		while(a2>0){
			System.out.print("S");
			a2--;
		}
		for(int i=1 ;i<=a3 ;i++){
			System.out.print(i);
		}
		System.out.println();
		

	}

}
