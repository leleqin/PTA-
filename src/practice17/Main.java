package practice17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arr = scan.next();
        int[] n = new int[10];
        for (int i=0;i<arr.length();i++){
           n [arr.charAt(i)-'0']++;//统计数组arr中不同数字出现的次数。得到对应n数组中哪一个下标，将字符转成数字，再记数加一  
        }
        for (int i=0; i<n.length;i++){
            if(n[i]!=0){
                System.out.println(i+":"+n[i]);
            }
        }

    }
}