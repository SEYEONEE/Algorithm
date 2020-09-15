package study;

import java.util.Scanner;

public class B5585 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int money = 1000 - A;
		int count =0;
		
		while(money !=0) {
			if(money>=500) {
				money -=500;
				count++;
			}
			if(money >=100) {
				count += money/100;
				money %= 100;
			}
			else if(money>=50) {
				count += money/50;
				money %= 50;
			}
			else if(money >= 10) {
				count += money/10;
				money %= 10;
			}
			else if(money >= 5) {
				count += money/5;
				money %= 5;
			}
			else {
				count +=money;
				money -= money;
			}
		}
		System.out.println(count);
	}
}