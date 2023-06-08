package com.kh.practice.condition;

import java.util.Scanner;

public class CompExample {
	private Scanner sc = new Scanner(System.in);
	
	while (true) {
		System.out.print("문자열:");
		String str = sc.nextLine();
		System.out.print("문자:");
		char c = sc.nextLine().charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("포함된 개수" + count);

		boolean exit = false; // while(true) 문자열: 을 끝내고 나갈수 있도록 하기 위한 변수
		while (true) {
			System.out.print("더 하시겠습니까?(y/n) :");
			String strContinue = sc.nextLine();
			if (strContinue.equals("y")) {
				break;
			} else if (strContinue.equals("n")) {
				exit = true; // while(true) 문자열: 을 끝낼수 있도록 true 대입
				break;
			} else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
			} // while(true) 더 하시겠습니까(y/n)
			if (exit) {
				break;
			}
		}
	}
}
}


