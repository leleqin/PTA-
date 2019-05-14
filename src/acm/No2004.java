package acm;

import java.util.Scanner;

/**
 * 成绩转换
 * @author leleqin
 *
 */
public class No2004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int score = scan.nextInt();
			if(score >= 90 && score <= 100) {
				System.out.println("A");
			}
			if(score >= 80 && score <= 89) {
				System.out.println("B");
			}
			if(score >= 70 && score <= 79) {
				System.out.println("C");
			}
			if(score >= 60 && score <= 69) {
				System.out.println("D");
			}
			if(score >= 0 && score <= 59) {
				System.out.println("E");
			}
			if(score > 100 || score < 0) {
				System.out.println("Score is error!");
			}
			
		}
	}

}
