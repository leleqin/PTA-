package practice24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 1;
		String A = "",B = "",C;
		while(scan.hasNext()) {
			C = scan.next();
			if(count == 2){
				A = C;
			}
			if(count == 14) {
				B = C;
			}
			if(C.equals(".")) {
				if(count > 2 && count < 14) {
					System.out.println(A +" is the only one for you...");
				}else if(count >= 14) {
					System.out.println(A +" and " + B + " are inviting you to dinner...");
				}else if(count <= 2) {
					System.out.println("Momo... No one is for you ...");
				}
			}
			count++;
		}
	}

}
