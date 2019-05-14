package acm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Let the Balloon Rise
 * 
 * @author leleqin
 *
 */
public class No1004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int N = scan.nextInt();
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < N; i++) {
				String balloon = scan.next();
				if (map.get(balloon) == null) {
					map.put(balloon, 1);
				} else {
					int count = map.get(balloon);
					map.put(balloon, count + 1);
				}
			}
			String maxNumBalloon = "";
			Integer maxNum = 0;
			for (String key : map.keySet()) {
				if (map.get(key) > maxNum) {
					maxNum = map.get(key);
					maxNumBalloon = key;
				}
			}
			System.out.print(maxNumBalloon);
			System.out.println();
		}
	}

}
