package practice8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] time = scan.next().split(":");
		if(Integer.parseInt(time[0]) >= 12 && Integer.parseInt(time[0]) < 24 && Integer.parseInt(time[1]) != 00) {
			for (int i = 0; i < Integer.parseInt(time[0])-11; i++) {
				System.out.printf("Dang");
			}
		}else if(Integer.parseInt(time[0]) > 12 && Integer.parseInt(time[0]) < 24 && Integer.parseInt(time[1]) == 00){
			for (int i = 0; i < Integer.parseInt(time[0])-12; i++) {
				System.out.printf("Dang");
			}
		}else {
			System.out.println("Only "+time[0]+":"+time[1]+".  Too early to Dang.");
		}
	}

}
