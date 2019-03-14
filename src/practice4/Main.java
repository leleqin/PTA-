package practice4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer n = scan.nextInt();
		String str[] = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"," "}; 
		String m = n.toString();
		char[] ar = m.toCharArray();
		String result = " ";
		if(n<0) {
			System.out.print("fu"+" ");
			for (int i = 1; i < ar.length; i++) {
				result = result + str[Integer.parseInt(String.valueOf(ar[i]))]+str[10];
			}
		}else {
			for (int i = 0; i < ar.length; i++) {
				result = result + str[Integer.parseInt(String.valueOf(ar[i]))]+str[10];
			}
		}
		System.out.println(result.trim());
		
	}
}
